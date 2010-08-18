package ware.lang.design;

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
 *
 */
public interface Report {

	/**
	 * 获取任务汇报的数据
	 * @return
	 */
	public WareData getReportWareData();
}
