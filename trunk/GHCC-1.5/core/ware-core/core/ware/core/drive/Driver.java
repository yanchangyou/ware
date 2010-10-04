package ware.core.drive;

import ware.core.context.WareContext;
import ware.core.exception.WareException;


/**
 * 驱动, 支持异常处理机制
 * @author yanchangyou
 *
 */
public interface Driver {

	/**
	 * 驱动执行
	 * @param context
	 * @throws Exception
	 */
	public void drive(WareContext context) throws WareException, Exception;
	
	/**
	 * 处理执行过程中的异常, 可以自己处理, 如果处理不了, 就上报上去, 由外界处理
	 * @param WareException
	 * @throws WareException
	 * @throws Exception
	 */
	public void dealWareException(WareException WareException) throws WareException, Exception;
	
}
