package singleton;

public class SingletonTest {
    public static void main(String[] args) {
        //不合法的构造函数 private
        //Singleton object=new Singleton();
        //获取唯一可用对象
        Singleton object=Singleton.getInstance();
        object.showMessage();
    }
}
