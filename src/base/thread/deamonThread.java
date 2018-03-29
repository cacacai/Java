package base.thread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.classfile.Field;

//守护线程
class DeamonTh implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("进入守护线程"+Thread.currentThread().getName());
	try {
		writeToFile();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("退出守护线程"+Thread.currentThread().getName());
	}

	private void writeToFile() throws IOException, InterruptedException {
		File filename=new File("text.txt");
		OutputStream os=new FileOutputStream(filename,true);
		int count=0;
		while (count<99) {
			os.write(("\r\nword"+count).getBytes());
			System.out.println("守护线程"+Thread.currentThread().getName()+"向文件中写入了word"+count);
			Thread.sleep(1000);
			count++;
		}
		os.close();
	}
	
}

public class deamonThread {
	public static void main(String[] args) {
		System.out.println("进入主线程"+Thread.currentThread().getName());
		DeamonTh deamonTh=new DeamonTh();
		Thread thread=new  Thread(deamonTh);
		thread.setDaemon(true);
		thread.start();
		Scanner in=new Scanner(System.in);
		in.next();
		in.close();
		System.out.println("退出主线程"+Thread.currentThread().getName());

		
	}
}
