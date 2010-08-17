package ware.lang.execute.action;

import org.dom4j.Element;

import ware.lang.execute.ExecuteExcepion;
import ware.lang.execute.ExecuteTool;
import ware.lang.execute.NoExecuteClassFoundException;

public class Speak extends Action {

	@Override
	public void execute() throws ExecuteExcepion {
		String text = dom4jElement.getText();
		ExecuteTool.speak(text);
	}

	@Override
	public void init(Element dom4jElement) throws NoExecuteClassFoundException {
		super.init(dom4jElement);
	}

}
