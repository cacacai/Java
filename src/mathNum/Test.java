package mathNum;

public class Test {
    public static void main(String[] args) {
        double[] a=new double[10];
        for (int i = 0; i < 10; i++) {
            a[i]=Math.random()+1;
        }

        for (double c :a) {
            System.out.println(c);
            test(c);
        }
    }
    private static void test(double num) {
        System.out.println("Math.floor(" + num + ")=" + Math.floor(num));
        System.out.println("Math.round(" + num + ")=" + Math.round(num));
        System.out.println("Math.ceil(" + num + ")=" + Math.ceil(num));
    }
}
