package ware.lang.execute.flow;

import java.util.Map;

import org.dom4j.Element;
import org.mvel.MVEL;

import ware.lang.execute.ExecuteExcepion;
import ware.lang.execute.NoExecuteClassFoundException;

/**
 * 
 * 	<for i="0" condition="" next="i+1">
 * 		
 * 	</for>
 * 
 *  
 * 
 * @author yanchangyou
 *
 */
public class For extends Flow {

	String condition;
	
	public void init(Element dom4jElement) throws NoExecuteClassFoundException {
		super.init(dom4jElement);
		condition = dom4jElement.attributeValue("condition");
	}
	
	public void execute() throws ExecuteExcepion {
		attributeMap = attributeToMap(dom4jElement);
		while (isSuitCodition()) {
			super.execute();
		}
	}
	Map<String, String> attributeMap = null;
	protected boolean isSuitCodition() {
		boolean suitable = MVEL.evalToBoolean(condition, attributeMap);
		if (suitable) {
			String next = attributeMap.get("next");
			if (!next.startsWith("i")) {
				next = "i" + next;
			}
			attributeMap.put("i", MVEL.eval(next, attributeMap).toString());
		}
		return suitable;
	}

}
