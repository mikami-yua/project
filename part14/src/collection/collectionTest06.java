package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 关于集合元素的remove
 *
 * 获取的迭代器对象相当于对当前集合的状态的快照，迭代器迭代的时候参照快照迭代
 * 集合改变，检查机制会报异常，需要重新获取新的快照
 * 迭代器的remove删除时会同时删除快照和集合，保存快照和集合的一致性
 */
public class collectionTest06 {
    public static void main(String[] args) {
        //创建集合
        Collection c=new ArrayList();

        /*
        Iterator it= c.iterator();

        此时获取迭代器，获取的是集合中没有元素状态下的迭代器
        一定注意：只有集合状态发生改变，迭代器必须重新获取
        当集合发生改变，迭代器没有重新获取时会发生异常：java.util.ConcurrentModificationException
         */
        //添加元素
        c.add(1);
        c.add(2);
        c.add(3);
        //获取迭代器
        Iterator it= c.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }

        Collection c2=new ArrayList();
        c2.add("abc");
        c2.add("dce");
        c2.add("sad");
        Iterator it2=c2.iterator();
        while (it2.hasNext()){
            Object obj=it2.next();
            //删除元素集合状态发生了变化
            //应该重新获取迭代器
            //java.util.ConcurrentModificationException
            //c2.remove(obj);

            //使用迭代器删除
            it2.remove();//删除当前指向的元素
            System.out.println(obj);
        }
        System.out.println(c2.size());
    }
}
