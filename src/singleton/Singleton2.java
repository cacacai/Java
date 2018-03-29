package singleton;

/**
 * 双重锁检测
 * 描述：这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 */
public class Singleton2 {
    private Singleton2 instance=null;
    private Singleton2(){}
    public Singleton2 getInstance(){
        if (instance==null){//
            synchronized (Singleton2.class){//同步锁
                if (instance==null)//防止后继线程拿到锁继续new
                instance=new Singleton2();
            }
        }
        return instance;
    }
}
