package list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * 1.默认arraylist集合初始化容量是10（底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量10------JDK13特性）
 * 2.arraylist集合底层是object数组
 * 3.构造函数
 * 4.arraylist的扩容，每次扩容50%，尽可能少的扩容，建议先与估计
 * 5.数组优点，检索效率高
 * 6.数组缺点：增删元素效率低（数组末尾添加效率高）
 */
public class arrayListTest01 {
    public static void main(String[] args) {
        //两种构造方式
        List list1= new ArrayList();//默认10
        List list2= new ArrayList(20);//指定初始化容量
        //size获取当前集合元素的个数

        //构造方法3：以集合作为参数
        Collection c=new HashSet();//创建hashset集合
        c.add(100);
        c.add(200);
        c.add(900);
        c.add(300);
        c.add(50);

        //通过这个构造方法，把hashset集合转换为list集合
        List list3=new ArrayList(c);//
        for (int i=0;i<list3.size();i++){
            System.out.println(list3.get(i));
        }
    }
}
