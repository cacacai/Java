package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class NowCoder2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        int[][] data=new int[n][4];
        /**
         * data
         * 0 天数
         * 1 1份一盒
         * 2 2份一盒
         * 3 三份一盒
         */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                data[i][j]=in.nextInt();
            }
            in.nextLine();
        }
        in.close();
        for (int i = 0; i < n; i++) {//数据条数n
            if (data[i][0]*6>(data[i][1]*1+data[i][2]*2+data[i][3]*3)){//首先判断是否足够雪糕
                System.out.println("No");
                break;
            }
            boolean flage=true;
            for (int j = 0; j < data[i][0]; j++) {//天数循环
                int count=0;
                for (int k = 1; k < 4; k++) {//雪糕种类循环
                    while (count<6&&data[i][k]>0){
                        count+=k;
                        data[i][k]-=1;
                    }
                }
                if (count!=6){
                    flage=false;
                    break;
                }
            }
            if (flage){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
