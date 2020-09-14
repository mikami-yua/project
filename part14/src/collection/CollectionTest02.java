package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 集合遍历和迭代（是所有collection通用的，map不能用
 *
 */
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection c= new ArrayList();
        //添加元素
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());

        //对集合进行遍历
        //1获取集合对象的迭代器对象Iterator
        Iterator it = c.iterator();
        //2.通过上面获取的迭代器对象开始迭代/遍历集合
        /*
        迭代器中的方法

        boolean hasNext() 仍有元素可以迭代，返回true
        Object next() 返回迭代的下一个元素

         */


        /*
        boolean h_next=it.hasNext();
        System.out.println(h_next);
        if(h_next==true){
            //不管当初存进去是什么，取出来都是object
            Object obj=it.next();
            System.out.println(obj);
        }
        h_next=it.hasNext();
        System.out.println(h_next);
        if(h_next==true){
            //不管当初存进去是什么，取出来都是object
            Object obj=it.next();
            System.out.println(obj);
        }
        h_next=it.hasNext();
        System.out.println(h_next);
        if(h_next==true){
            //不管当初存进去是什么，取出来都是object
            Object obj=it.next();
            System.out.println(obj);
        }
        h_next=it.hasNext();
        System.out.println(h_next);
        if(h_next==true){
            //不管当初存进去是什么，取出来都是object
            Object obj=it.next();
            System.out.println(obj);
        }
        h_next=it.hasNext();
        System.out.println(h_next);
        if(h_next==true){
            //不管当初存进去是什么，取出来都是object
            Object obj=it.next();
            System.out.println(obj);
        }

         */
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }

    }
}
