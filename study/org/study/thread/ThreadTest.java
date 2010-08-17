package org.study.thread;

public class ThreadTest {

	public static void main(String[] args) {
		SerialNum serialNum = new SerialNum();
		for (int i = 0; i < 10; i++) {
			new Thread() {
				@Override
				public void run() {
					super.run();
					SerialNum serialNum = new SerialNum();
					System.out.println(serialNum.get());
					System.out.println(serialNum.get());
				}
			}.start();
		}
	}
}

class MyThread extends Thread {
	
	public String getData() {
		return "my thread";
	}
	public void run() {
		System.out.println(((MyThread)Thread.currentThread()).getData());
	}
	public static void main(String[] args) {
		new MyThread().start();
	}
}
class SerialNum {
    // The next serial number to be assigned
    private static int nextSerialNum = 0;

    private static ThreadLocal serialNum = new ThreadLocal() {
        protected synchronized Object initialValue() {
            return new Integer(nextSerialNum++);
        }
    };

    public static int get() {
        return ((Integer) (serialNum.get())).intValue();
    }
}
