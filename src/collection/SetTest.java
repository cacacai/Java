package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void testHashSrt(){
        Set<String> set=new HashSet<>();

        set.add("bbbb");
        set.add("ddddd");
        set.add("FFFFFFF");
        set.add("ccccc");
        set.add("aaaaaaaaaaaa");
        Set<String> t=new HashSet<>();
        t.addAll(set);
        System.out.println(set.size());
        for (String temp:t) {
            System.out.println(temp);
        }
        //输出无序
    }

    /**
     * LinkedHashSet是用一个链表实现来扩展HashSet类，
     * 它支持对规则集内的元素排序。
     * HashSet中的元素是没有被排序的，
     * 而LinkedHashSet中的元素可以按照它们插入规则集的顺序提取。
     */
    public static void testLinkedSet(){
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("bbbb");
        set.add("ddddd");
        set.add("FFFFFFF");
        set.add("ccccc");
        set.add("aaaaaaaaaaaa");
        Set<String> t=new HashSet<>();
        t.addAll(set);
        System.out.println(set.size());
        for (String temp:set) {
            System.out.println(temp);
        }
    }

    /**
     * TreeSet扩展自AbstractSet，并实现了NavigableSet，AbstractSet扩展自AbstractCollection，
     *
     * 树形集是一个有序的Set，其底层是一颗树，这样就能从Set里面提取一个有序序列了。在实例化TreeSet时，我们可以给TreeSet指定一个比较器Comparator来指定树形集中的元素顺序。
     * 树形集中提供了很多便捷的方法。
       */
    public static void testTreeSet(){
        TreeSet<String> set=new TreeSet<>();
        set.add("bbbb");
        set.add("ddddd");
        set.add("FFFFFFF");
        set.add("ccccc");
        set.add("aaaaaaaaaaaa");
        Set<String> t=new HashSet<>();
        t.addAll(set);
        System.out.println(set.first());
        System.out.println(set.lower("a"));
        /**
         * System.out.println(set.lower(3333)); //小于3333的最大元素
         System.out.println(set.higher(2222)); //大于2222的最大元素
         System.out.println(set.floor(3333)); //不大于3333的最大元素
         System.out.println(set.ceiling(3333)); //不小于3333的最大元素
         System.out.println(set.pollFirst()); //删除第一个元素
         System.out.println(set.pollLast()); //删除最后一个元素
         */
        System.out.println(set);

    }



    public static void main(String[] args) {
        //testHashSrt();
        //testLinkedSet();
        testTreeSet();
    }
}
