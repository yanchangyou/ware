package ware.lang.design.concept.ware.flow;

import ware.lang.design.concept.ware.Flow;

/**
 * 
 * for 循环流程<br>
 * <textarea rows="4" cols="40">
<for i="0" condition="" next="i+1">
	<!-- some code-->
</for>
 * </textarea>
 * 
 * @author yanchangyou
 * @date 2010-8-21 23:44:50
 * @version 1.1.0
 *
 */
public interface For extends Flow {

	public boolean isSuitCodition();

}
