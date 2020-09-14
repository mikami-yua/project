package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 深入collection集合的contains方法------判断集合中是否包含某个元素
 *
 * string类的equals方法比的是内容，不是地址
 *
 * contains方法的底层调用了equals方法
 */
public class collectionTest04 {
    public static void main(String[] args) {
        Collection c=new ArrayList();

        String s1= new String("abc");
        c.add(s1);
        String s2= new String("def");
        c.add(s2);
        System.out.println(c.size());

        String x=new String("abc");
        System.out.println(c.contains(x));//true
    }
}
