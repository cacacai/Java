package algorithm;

import java.util.Scanner;

/**
 *
 * 一个圆划分为N个扇形，现用M种颜色对其上色，要求相邻两块扇形的颜色不能相同，问有多少种上色方案？（其中N>=1,M>=3)
 * 注意：不考虑对称性，例如：一个圆划分为2个扇形，用3种颜色上色方案有“黑红，黑白，白红，白黑，红白，红黑”6种，
 * 相当于每个扇形都有编号，是不一样的。
 *
 */
public class circleColor {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        in.close();
        if (n>=1&&m>=1){
            int count=color(n,m);
            System.out.println(count);
        }

    }

    /**
     *
     * @param n 扇形数
     * @param m 颜色数量
     * @return
     */
    public static int color(int n,int m){
        if(n==1){
            return m;
        }
        if (n==2){
            return m*(m-1);
        }
        if (n==3){
            return m*(m-1)*(m-2);
        }else {
            return color(n-1,m)*(m-2)+color(n-2,m)*(m-1);
        }
    }
}
