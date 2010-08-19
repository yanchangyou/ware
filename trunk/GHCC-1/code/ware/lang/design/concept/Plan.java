package ware.lang.design.concept;

import ware.lang.design.drive.Drive;

/**
 * 
 * plan : 对ware安排任务<br>
 * <br>
 * ware之间的上下级交互模式<br>
 * 上级对下级安排任务(plan)<br>
 * 下级对上级汇报任务完成情况<br>
 * 
 * 
 * @author yanchangyou
 *
 */
public interface Plan extends Drive, WareProtocolDataDeliver {

	/**
	 * 获取任务的数据
	 * @return
	 */
	public WareProtocolData getPlanWareProtocolData();
}
