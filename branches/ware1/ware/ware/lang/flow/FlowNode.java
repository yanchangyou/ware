package ware.lang.flow;


public abstract class FlowNode {

//	List<ExecuteListener> executeListenerList = new ArrayList<ExecuteListener>();
	
	public abstract void execute() throws ExecuteExcepion;
	
//	public void addExecuteListener(ExecuteListener executeListener) {
//		executeListenerList.add(executeListener);
//	}
//	
//	public void wrapExecute() throws ExcecuteListenerExcepion, ExecuteExcepion {
//		for (Iterator<ExecuteListener> iterator = executeListenerList.iterator(); iterator.hasNext();) {
//			ExecuteListener executeListener = (ExecuteListener) iterator.next();
//			executeListener.doWhenExecute(this);
//		}
//	}
}
