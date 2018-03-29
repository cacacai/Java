package collection;

import java.util.*;
/**
 * 接口Map提供了很多查询、更新和获取存储的键值对的方法，
 * 更新包括方法clear()、put()、putAll()、remove()等等，
 * 查询方法包括containsKey、containsValue等等。Map接口常用的有三个具体实现类，
 * 分别是HashMap、LinkedHashMap、TreeMap。

 作者：尘语凡心
 链接：https://www.jianshu.com/p/63e76826e852
 來源：简书
 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class MapTest {
    /**
     * 在之前的版本中，HashMap采用数组+链表实现，即使用链表处理冲突，同一hash值的链表都存储在一个链表里。
     * 但是当链表中的元素较多，即hash值相等的元素较多时，通过key值依次查找的效率较低。
     * 而JDK1.8中，HashMap采用数组+链表+红黑树实现，当链表长度超过阈值（8）时，将链表转换为红黑树，这样大大减少了查找时间。
     */
    public static <E> void testHashMap(){
        Map<Integer,String> m1=new HashMap<>();
        m1.put(1,"aaaa");
        m1.put(2,"bbbb");
        m1.put(3,"ccc");
        System.out.println(m1.size());
        System.out.println(m1.entrySet().getClass());
        //map的三种视图
        Set<Map.Entry<Integer,String>> set=m1.entrySet();
        Set<E> set_key=(Set<E>) m1.keySet();
        //Set<E> set_key2=(Set<E>) m1.keySet();
        Collection<String> col_value=m1.values();//不能返回Set,value的值可能有重复
        //Iterator<Map.Entry<Integer,String>> iter_Entry=set.iterator();
        Iterator<Map.Entry<Integer,String>> iter_Entry=set.iterator();
        Iterator iter_key=set_key.iterator();
        Iterator<String> iter_Values=col_value.iterator();
        while (iter_Entry.hasNext()){
            Map.Entry<Integer,String> mapEntry=iter_Entry.next();
            System.out.println(mapEntry);
        }
        for (E key:set_key) {
            System.out.println(key);
        }

    }

    public static void main(String[] args) {
        testHashMap();
    }
}
