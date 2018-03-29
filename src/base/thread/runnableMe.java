package base.thread;

import com.sun.javafx.font.t2k.T2KFactory;
import com.sun.org.apache.bcel.internal.generic.NEW;

class MyRunnable implements Runnable{
	
	private int ticketsCount=5;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (ticketsCount>0) {
			ticketsCount--;
			System.out.println(Thread.currentThread().getName()+"卖掉了1张火车票，剩余票数为"+ticketsCount);
			
		}
	}
}
public class runnableMe {
	public static void main(String[] args) {
		MyRunnable mRunnable=new MyRunnable();
		Thread t1=new Thread(mRunnable, "窗口1");
		Thread t2=new Thread(mRunnable, "t2");
		Thread t3=new Thread(mRunnable);
		//开启线程
		t1.start();
		t2.start();
		t3.start();
	}

}
