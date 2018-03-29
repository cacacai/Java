package mathNum;

/**
 * JAVA中的自动装箱与拆箱
 * 装箱就是自动将基本数据类型转换为包装器类型；
 * 拆箱就是自动将包装器类型转换为基本数据类型。
 * -128-127 之间值被装箱之后，会直接放在内存里进行重用
 * 但是如果超过了这个值，系统会直接new一个对象
 */
public class Number {
    public static void main(String[] args) {
        Integer i1=128;//装箱，相当于Integer.valueOf(128);
        int i2=i1;//拆箱,相当于i1.intValue()
        Integer i3=12;
        Integer a=128;
        Integer b=12;
        System.out.println(i1==a);//false
        //true
        System.out.println(i1.equals(a));
        System.out.println(i3==b);
        System.out.println(i3.equals(b));

    }
}
