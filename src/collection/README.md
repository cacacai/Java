
### Java中的Set,List,Map的区别，对JAVA的集合的理解是想对于数组<br>
数组是大小固定的，并且同一个数组只能存放类型一样的数据（基本类型/引用类型），JAVA集合可以存储和操作数目不固定的一组数据。 所有的JAVA集合都位于 java.util包中！ JAVA集合只能存放引用类型的的数据，不能存放基本数据类型。

## JAVA集合主要分为三种类型： 

### Set(集) 
### List(列表) 
### Map(映射) 

Collection 接口 ：Collection是最基本的集合接口，声明了适用于JAVA集合（只包括Set和List）的通用方法。 Set 和List 都继承了Conllection,Map

Collection接口的方法： 

boolean add(Object o)：向集合中加入一个对象的引用 

void clear()：删除集合中所有的对象，即不再持有这些对象的引用 

boolean isEmpty()：判断集合是否为空 

boolean contains(Object o)： 判断集合中是否持有特定对象的引用 

Iterartor iterator()：返回一个Iterator对象，可以用来遍历集合中的元素 

boolean remove(Object o) ：从集合中删除一个对象的引用 

int size()       ：返回集合中元素的数目 

Object[] toArray()    ： 返回一个数组，该数组中包括集合中的所有元素 

关于：Iterator() 和toArray() 方法都用于集合的所有的元素，前者返回一个Iterator对象，后者返回一个包含集合中所有元素的数组。 

Iterator接口声明了如下方法： 

hasNext()：判断集合中元素是否遍历完毕，如果没有，就返回true 

next() ：返回下一个元素 

remove()：从集合中删除上一个有next()方法返回的元素。 

Set(集合)： Set是最简单的一种集合。集合中的对象不按特定的方式排序，并且没有重复对象。 Set接口主要实现了两个实现类：

HashSet： HashSet类按照哈希算法来存取集合中的对象，存取速度比较快 
TreeSet ：TreeSet类实现了SortedSet接口，能够对集合中的对象进行排序。 

List接口扩展自Collection，它可以定义一个允许重复的有序集合，
从List接口中的方法来看，List接口主要是增加了面向位置的操作，允许在指定位置上操作元素，同时增加了一个能够双向遍历线性表的新列表迭代器ListIterator。AbstractList类提供了List接口的部分实现，AbstractSequentialList扩展自AbstractList，主要是提供对链表的支持。下面介绍List接口的两个重要的具体实现类，
也是我们可能最常用的类，ArrayList和LinkedList。

ArrayList

通过阅读ArrayList的源码，我们可以很清楚地看到里面的逻辑，它是用数组存储元素的，这个数组可以动态创建，如果元素个数超过了数组的容量，那么就创建一个更大的新数组，并将当前数组中的所有元素都复制到新数组中。

Map，图，是一种存储键值对映射的容器类，在Map中键可以是任意类型的对象，但不能有重复的键，每个键都对应一个值，真正存储在图中的是键值构成的条目。下面是接口Map的类结构。

1.Vector
前面我们已经提到，Java设计者们在对之前的容器类进行重新设计时保留了一些数据结构，其中就有Vector。用法上，Vector与ArrayList基本一致，不同之处在于Vector使用了关键字synchronized将访问和修改向量的方法都变成同步的了，所以对于不需要同步的应用程序来说，类ArrayList比类Vector更高效。

2.Stack
Stack，栈类，是Java2之前引入的，继承自类Vector。

3.HashTable
HashTable和前面介绍的HashMap很类似，它也是一个散列表，存储的内容是键值对映射，不同之处在于，HashTable是继承自Dictionary的，HashTable中的函数都是同步的，这意味着它也是线程安全的，另外，HashTable中key和value都不可以为null。

上面的三个集合类都是在Java2之前推出的容器类，可以看到，尽管在使用中效率比较低，但是它们都是线程安全的。下面介绍两个特殊的集合类。

4.ConcurrentHashMap
Concurrent，并发，从名字就可以看出来ConcurrentHashMap是HashMap的线程安全版。同HashMap相比，ConcurrentHashMap不仅保证了访问的线程安全性，而且在效率上与HashTable相比，也有较大的提高。关于ConcurrentHashMap的设计，我将会在下一篇关于并发编程的博客中介绍，敬请关注。

5.CopyOnWriteArrayList
CopyOnWriteArrayList，是一个线程安全的List接口的实现，它使用了ReentrantLock锁来保证在并发情况下提供高性能的并发读取。

作者：尘语凡心
链接：https://www.jianshu.com/p/63e76826e852
來源：简书
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

原文地址http://blog.csdn.net/wordinput/article/details/5223876