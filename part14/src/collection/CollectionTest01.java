package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection接口中常用的方法
 * 1。collection中可以存放的元素
 *      没有使用泛型之前可以存放object的所有子类型
 *      使用泛型之后只能存放某个具体的类型
 *      （集合中不能之间存放基本数据类型，也不能存放java对象，而是存放java的内存地址）
 * 2. collection中的常用方法
 *      boolean add(Object e) 向集合中添加元素
 *      int size()            获取集合元素的个数
 *      void clear()          清空集合
 *      boolean contains(Object o) 判断当前集合中是否包含元素o
 *      boolean remove(Object o) 删除集合中某个元素
 *      boolean isEmpty()      判断集合是否为空
 *      Object[] toArray()      把集合转换为数组
 */
public class CollectionTest01 {
    public static void main(String[] args) {

        // Collection c= new Collection() ;//接口是抽象的不能实例化
        Collection c=new ArrayList();
        //测试collection接口中的常用方法
        c.add(1200);//自动装箱，实际是放进去了一个对象的内存地址。Integer x=new Integer（1200）
        c.add(3.14);
        c.add(true);
        c.add(new Object());
        System.out.println(c.size());
        c.clear();
        System.out.println(c.size());
        c.add("hello");
        c.add("world");
        c.add("常常");
        boolean flag1=c.contains("常常");
        System.out.println(flag1);
        boolean flag2=c.contains("常常33");
        System.out.println(flag2);
        System.out.println(c.size());

        //删除元素
        c.remove("hello");
        System.out.println(c.size());

        System.out.println(c.isEmpty());

        c.add(100);
        c.add("abc");

        Object[] objs= c.toArray();

        for (int i=0;i<objs.length;i++){
            System.out.println(objs[i]);
        }


    }

}
