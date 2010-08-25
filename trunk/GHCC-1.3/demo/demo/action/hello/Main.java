package demo.action.hello;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import ware.lang.design.Ware$Entity;
import ware.lang.design.Ware$Node;

public class Main {

	/**
	 * 外界参数<br>
	 * 
	 * {ware.path}?{ware.param} {ware.path} := ./yyy/../xxx.ware.xml
	 * {ware.param} := name1=value1&name2=value2...
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		// 外界参数
		// 规则 只能有一个字符串, 字符串采用 url的参数的格式, 如下:
		// name1=value1&name2=value2&...

		// 模拟外界参数
		args = new String[1];
		args[0] = "demo/action/hello/node/Hello.ware.xml?"
				+ "ware.keywords=demo/action/hello/keywords/hello.ware.keywords.xml";

		WareParam wareParam = new WareParam(args[0]);
		// 获取ware.xml路径, 采用classloader能找到的方式
		String wareXML = wareParam.getWarePath();

		Map<String, String> paramMap = wareParam.getWareParam();
		// 关键字定义
		String keyWords = paramMap.get("ware.keywords");

		Element wareRootElement = getRootElement(wareXML);

		Element keywordsRootElement = getRootElement(keyWords);

		// 获取标签名称, 也是关键字
		String keywordTagName = wareRootElement.getName();

		// 查找对于的实体名称
		String keywordXPath = "keywords/keyword[@name='" + keywordTagName
				+ "']/@entityClass";
		String entityClassName = keywordsRootElement.selectSingleNode(
				keywordXPath).getText();

		Object obj = Class.forName(entityClassName).newInstance();

		Ware$Node node = (Ware$Node) obj;

		String nodeXML = wareRootElement.asXML();
		node.check(nodeXML);
		node.parse(nodeXML);

		Ware$Entity entity = (Ware$Entity) obj;

		// TODO 此处要注意， 不能needDoBeforeBuild()和beforeBuildDo()不能以来build
		// 构建之前
		if (entity.needDoBeforeBuild()) {
			entity.beforeBuildDo();
		}

		// 构建
		entity.build();

		// 构建之后
		if (entity.needDoAfterBuild()) {
			entity.afterBuildDo();
		}
	}

	public static Element getRootElement(String path) throws DocumentException {
		InputStream input = Main.class.getClassLoader().getResourceAsStream(
				path);
		SAXReader saxReader = new SAXReader();
		Document document = saxReader.read(input);
		return document.getRootElement();
	}

}

class WareParam {
	
	private String warePath;

	private Map<String, String> wareParam;

	public String getWarePath() {
		return warePath;
	}

	public void setWarePath(String warePath) {
		this.warePath = warePath;
	}

	public Map<String, String> getWareParam() {
		return wareParam;
	}

	public void setWareParam(Map<String, String> wareParam) {
		this.wareParam = wareParam;
	}

	public WareParam(String param) {
		if (param == null) {
			throw new NullPointerException("WareParam 不能为空");
		}
		int indexOfQuestionMark = param.indexOf('?');
		if (indexOfQuestionMark == -1) {
			warePath = param;
		} else {
			warePath = param.substring(0, indexOfQuestionMark);
			wareParam = parsingParam(param.substring(indexOfQuestionMark+1));
		}
	}

	/**
	 * 解析参数成map
	 * 
	 * @param paramString
	 * @return
	 */
	public static Map<String, String> parsingParam(String paramString) {
		Map<String, String> paramMap = new HashMap<String, String>();

		if (paramString != null) {
			String[] params = paramString.split("\\&");
			for (int i = 0; i < params.length; i++) {
				// 忽略不规范的参数
				if (params[i].indexOf('=') != -1 // 存在等号
						&& !params[i].startsWith("=") // 并且不能以等号开头
						&& !params[i].endsWith("=") // 并且不能以等号结尾
				) {
					String[] nameValues = params[i].split("=");
					paramMap.put(nameValues[0], nameValues[1]);
				}
			}
		}

		return paramMap;
	}
}
