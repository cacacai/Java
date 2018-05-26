package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        /**
         * boolean hasNext(String p)
         * 停止条件：如果默认成参数p为空的话就会一直返回false，定义了参数p之后如果匹配就返回true否则返回false
         */
        while (!in.hasNext("exit")){//读取到exit后直接跳出循环
            System.out.println(in.nextLine());
        }
        in.nextLine();
        System.out.println("------------");
        /**
         * boolean hasNextLine()
         *停止条件：读取到文件结束符号EOF返回false，否则返回true
         * 一般使用于文件读取
         */
        try {
            Scanner fileIn=new Scanner(new File("/home/cai/temp/cai.txt"));
            while (fileIn.hasNextLine()){
                System.out.println(fileIn.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
