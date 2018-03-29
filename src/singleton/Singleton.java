package singleton;
//单例模式

/**
 * 最基本实现方法，不支持多线程，因为没有加锁synchronized
 */
public class Singleton {
    private Singleton(){}//私有构造函数
    private static Singleton instance=null;//单例对象
    //静态工厂方法
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World");
    }
}
