package base.thread;

import sun.applet.Main;

class MyThread extends Thread{
	private int ticketCount=5;//一共5张火车票
	private String name;//窗口 火车站名字
	public MyThread(String name) {
		this.name=name;
	}
	
	public void run() {
		while (ticketCount>0) {
			ticketCount--;//如果还有票就卖掉一张
			System.out.println(name+"卖了一张票，剩余:"+ticketCount);
		}
	}
	
}
public class ThreadMe {
	public static void main(String[] args) {
		//创建三个线程，模拟三个窗口卖票
		MyThread mt1=new MyThread("窗口一");
		MyThread mt2=new MyThread("窗口二");
		MyThread mt3=new MyThread("窗口三");
		//启动线程
		mt1.start();
		mt2.start();
		mt3.start();
		
	}
}
