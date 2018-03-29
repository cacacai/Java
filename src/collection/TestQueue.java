package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ，方法offer表示向队列添加一个元素，
 * poll()与remove()方法都是移除队列头部的元素，两者的区别在于如果队列为空，那么poll()返回的是null，而remove()会抛出一个异常。
 * 方法element()与peek()主要是获取头部元素，不删除。

 接口Deque，是一个扩展自Queue的双端队列，它支持在两端插入和删除元素，因为LinkedList类实现了Deque接口，所以通常我们可以使用LinkedList来创建一个队列。
 PriorityQueue类实现了一个优先队列，优先队列中元素被赋予优先级，拥有高优先级的先被删除。
  */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<>();
        queue.offer("aaa");
        queue.offer("bbb");
        queue.offer("fff");
        queue.offer("ccc");
        while (queue.size()>0){
            System.out.println(queue.remove());
        }

    }
}
