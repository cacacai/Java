package singleton;

/**
 * 指令重排情况
 * 防止线程A在还未完成对象创建前，线程B进入并获取到并没有完成初始化的对象
 * volatile阻止变量前后指令重排，保证指令顺序执行
 */
public class Singleton3 {
    private Singleton3(){}
    private volatile static Singleton3 instance=null;
    public static Singleton3 getInstance(){
        if (instance==null){
            synchronized (Singleton3.class){
                if (instance==null){
                    instance=new Singleton3();
                }
            }
        }
        return instance;
    }
}
