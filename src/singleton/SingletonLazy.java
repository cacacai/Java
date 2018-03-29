package singleton;

/**
 * 懒汉式 lazy loading
 * 支持多线程 效率低
 * 第一次调用次初始化，避免内存浪费
 * 必须加锁synchronized才能保证单例，但影响效率
 *
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){}

    public static synchronized SingletonLazy getInstance() {
        if (instance==null){
            instance=new SingletonLazy();
        }
        return instance;
    }
}

