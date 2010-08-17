package ware.lang.execute.flow;

import java.util.Map;

import org.dom4j.Element;
import org.mvel.MVEL;

import ware.lang.execute.ExecuteExcepion;
import ware.lang.execute.NoExecuteClassFoundException;

/**
 * 
 * 
 * 	<while condition="">
 * 		
 * 	</while>
 * 
 * @author yanchangyou
 *
 */

public class While extends Flow {
	String condition;
	
	public void init(Element dom4jElement) throws NoExecuteClassFoundException {
		super.init(dom4jElement);
		condition = dom4jElement.attributeValue("condition");
	}
	
	public void execute() throws ExecuteExcepion {
		while (isSuitCodition()) {
			super.execute();
		}
	}
	
	protected boolean isSuitCodition() {
		Map<String, String> attributeMap = attributeToMap(dom4jElement);
		boolean suitable = MVEL.evalToBoolean(condition, attributeMap);
		return suitable;
	}
}
