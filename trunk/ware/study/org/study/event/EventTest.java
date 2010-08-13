package org.study.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * 
 * 
 * 事件模型的三个支点<br>
 * 1， 事件产生<br>
 * 2， 事件传播<br>
 * 3， 事件处理<br>
 * 
 * 面向变化的处理机制:事件机制<br>
 * 
 * 事件与消息的差别<br>
 * 
 * 事件内传, 消息外传<br>
 *
 * task
 * 活动->动作->
 * 
 * task(entry, flow)
 * 
 * flow购买<br>
 * 
 * @author yanchangyou
 *
 */
public class EventTest {

	List listenerList= new ArrayList();
	public void addEventListener(EventListener listener) {
		listenerList.add(listener);
	}
	
	public void removeChangeListener(EventListener listener) {
		listenerList.remove(listener);
	}
	
	public void fireEvent(Event event) {
		for (Iterator iterator = listenerList.iterator(); iterator.hasNext();) {
			EventListener listener = (EventListener) iterator.next();
			listener.doWhenEventOccur(event);
		}
	}
	
	public static void main(String[] args) {

		Event event = new Event();
		event.name = "event1";
		event.param.put("obj", "a string obj");
		
		EventTest test = new EventTest();
		test.fireEvent(event);
		
		test.addEventListener(new EventListener() {

			@Override
			public void doWhenEventOccur(Event event) {
				System.out.println("event name is : " + event.name);
			}
		});
		
		test.fireEvent(event);
		
		test.addEventListener(new EventListener() {

			@Override
			public void doWhenEventOccur(Event event) {
				System.out.println("event param is : " + event.param);
			}
		});
		
		test.fireEvent(event);
		test.fireEvent(event);
		
		
	}
	
}

class Event {
	
	public String name;
	public Map param = new HashMap();
	
}

abstract class EventListener {
	public abstract void doWhenEventOccur(Event event);
}