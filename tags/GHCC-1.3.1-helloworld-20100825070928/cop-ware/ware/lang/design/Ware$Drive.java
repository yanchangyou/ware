package ware.lang.design;

import org.cop.norm.Drive;

/**
 * 驱动概念在CPU上执行
 * @author yanchangyou
 * @date 2010-8-22 23:12:06
 * @version 1.2.0
 *
 */
public interface Ware$Drive extends Drive {

	/**
	 * 在CPU上面执行驱动执行
	 */
	public void drive();
}
