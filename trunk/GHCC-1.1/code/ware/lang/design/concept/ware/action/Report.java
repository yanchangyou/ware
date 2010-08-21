package ware.lang.design.concept.ware.action;

import ware.lang.design.concept.ware.Deliver;
import ware.lang.design.concept.ware.WareProtocolData;


/**
 * 
 * report : 对ware汇报任务完成情况<br>
 * <br>
 * ware之间的上下级交互模式<br>
 * 上级对下级安排任务(plan)<br>
 * 下级对上级汇报(report)任务完成情况<br>
 * 
 * 
 * @author yanchangyou
 * @date 2010-8-21 23:43:51
 * @version 1.1.0
 *
 */
public interface Report extends Deliver, WareActionConcept {

	/**
	 * 获取任务汇报的数据
	 * @return
	 */
	public WareProtocolData getReportWareProtocolData();
}
