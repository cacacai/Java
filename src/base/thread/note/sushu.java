package base.thread.note;
//求素数
public class sushu {
    public static void main(String[] args) {
        for (int i = 3; i < 1000; i++) {
            if (one(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean one(int num){
        int temp=(int)Math.sqrt(num);
        int i = 2;
        for (; i <= temp; i++) {
            if (num%i==0){
                return false ;
            }
        }
        if (i>=temp){
            return true;
        }else {
            return false;
        }
    }
}
