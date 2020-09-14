package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 迭代和遍历
 */
public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c1=new ArrayList();
        c1.add(new Object());
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(1);//ArrayList有序可重复

        Iterator it =c1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //hashset无序不可重复
        Collection c2=new HashSet();
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(400);
        c2.add(500);
        c2.add(100);

        Iterator it2=c2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
//p197

    }
}
