package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * list中接口常用方法
 *
 * 1.list元素特点：
 *      有序可重复
 *      有序：list元素有下标（0-n）
 *
 * 2.list是collection接口的子接口
 *      只列出特有的常用方法
 *      void add(int index,E element)
 *      E get(int index)
 *      int indexOf(Object o)
 *      int lastIndexOf(Object o)
 *      E move(int index)
 *      E set(int index,E element)
 *
 */
public class listTest01 {
    public static void main(String[] args) {
        //希望使用list中特有的方法需要创建list中特有的方法
        List mylist= new ArrayList();

        //collection中的方法可以使用
        mylist.add("A");//默认向末尾添加元素
        mylist.add("B");
        mylist.add("C");

        //使用list中的特有方法
        mylist.add(1,"king");//向指定下标位置插入元素（对arraylist来说效率低）


        //迭代
        Iterator it=mylist.iterator();
        while (it.hasNext()){
            Object elt=it.next();
            System.out.println(elt);
        }

        //根据下标获取元素
        Object obj=mylist.get(0);
        System.out.println(obj);
        //通过for遍历【list特有】
        for(int i=0;i<mylist.size();i++){
            Object obj1=mylist.get(i);
            System.out.print(obj1);
        }

        //获取指定对象第一次出现处的索引
        System.out.println(mylist.indexOf("king"));//1
        //获取指定对象最后一次出现处的索引
        System.out.println(mylist.lastIndexOf("C"));//3

        //删除下标为0的
        mylist.remove(0);
        System.out.println(mylist.size());

        //修改下标元素
        mylist.set(2,"soft");
        for(int i=0;i<mylist.size();i++){
            Object obj1=mylist.get(i);
            System.out.print(obj1);
        }
    }
}
