package base.thread.note;

public class two {
    //求 2*x + 3*y = 7的解     ax+by=c
    // 2*x = 7-3*y    ax=c-by
    //1,求出一个特殊解x0，y0
    //2求通解 x= x0+bt;  y=y0-at
    public static void main(String[] args) {
        int x = 0, y = 0;
        for (y = 0; y < 100; y++) {
            if ((7 - 3 * y) % 2 == 0) {
                x = (7 - 3 * y) / 2;
                break;
            }
        }
        System.out.println(x + "," + y);
        for (int t = 0; t < 10; t++) {
            int x1 = x + 3 * t;
            int y1 = y - 2 * t;

            System.out.println(x1 + "," + y1);
        }
    }
}