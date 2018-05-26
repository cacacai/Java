package algorithm;

import java.util.Scanner;

public class NouCoder1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int count=0;
        int x=in.nextInt();//每天房租
        int f=in.nextInt();//初始水果数
        int d=in.nextInt();//初始金钱
        int p=in.nextInt();//水果价格
        in.close();
        //每天 房租+水果
        if (f*x<=d){//金钱足以支持水果的天数的房租
            count=f;
            d-=f*x;
            count+=d/(x+p);
            System.out.print(count);
            return;
        }else{//如果金额不足以支持水果的天数的房租
            count=d/x;
            System.out.print(count);
            return;
        }





    }
}
