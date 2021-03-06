##单例模式<br>
单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。

注意：

1、单例类只能有一个实例。
2、单例类必须自己创建自己的唯一实例。
3、单例类必须给所有其他对象提供这一实例。
介绍
意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。

主要解决：一个全局使用的类频繁地创建与销毁。

何时使用：当您想控制实例数目，节省系统资源的时候。

如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。

关键代码：构造函数是私有的。
优点： 1、在内存里只有一个实例，减少了内存的开销，尤其是频繁的创建和销毁实例（比如管理学院首页页面缓存）。 2、避免对资源的多重占用（比如写文件操作）。

缺点：没有接口，不能继承，与单一职责原则冲突，一个类应该只关心内部逻辑，而不关心外面怎么样来实例化。

使用场景： 1、要求生产唯一序列号。 2、WEB 中的计数器，不用每次刷新都在数据库里加一次，用单例先缓存起来。 3、创建的一个对象需要消耗的资源过多，比如 I/O 与数据库的连接等。

注意事项：getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 防止多线程同时进入造成 instance 被多次实例化。
###多线程
1.在java多线程编程中对象锁、类锁、同步机制synchronized详解：
对象锁：在java中每个对象都有一个唯一的锁，对象锁用于对象实例方法或者一个对象实例上面的。
类锁：是用于一个类静态方法或者class对象的，一个类的实例对象可以有多个，但是只有一个class对象。
同步机制synchronized：synchronized关键字用于修饰方法或者单独的synchronized代码块，当一个线程想执行synchronized中的内容时，必须先获取到对象锁，当对象锁没有线程占用时，进入synchronized方法会自动获取到对象锁，执行完毕后会自动释放锁，如果对象锁被A线程占用，B线程想执行synchronized的代码只能等待A个线程执行完毕后，释放对象锁，B线程才能获取到对象锁进入方法执行。一个线程获得对象A的锁，也可以获得对象B的锁，两个不同类的对象锁没有关联。
                                                                                                                                                                                                                                                
###指令重排
比如java中简单的一句 instance = new Singleton，会被编译器编译成如下JVM指令：

memory =allocate(); //1：分配对象的内存空间<br>
ctorInstance(memory); //2：初始化对象<br>
instance =memory; //3：设置instance指向刚分配的内存地址<br>

但是这些指令顺序并非一成不变，有可能会经过JVM和CPU的优化，指令重排成下面的顺序：

memory =allocate(); //1：分配对象的内存空间 <br>
instance =memory; //3：设置instance指向刚分配的内存地址<br>
ctorInstance(memory); //2：初始化对象

当线程A执行完1,3,时，instance对象还未完成初始化，但已经不再指向null。
此时如果线程B抢占到CPU资源，执行 if（instance == null）的结果会是false，从而返回一个没有初始化完成的instance对象.



参考https://zhuanlan.zhihu.com/p/33102022                                                                                                                                                                                                                                                                 
