package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

/**
 * 测试contains方法
 *
 * 放在集合中的元素要重写equals方法
 */
public class collectionTest05 {
    public static void main(String[] args) {
        //创建集合对象
        Collection c=new ArrayList();

        //创建用户对象
        Uesr u1 = new Uesr("jack");
        Uesr u2 = new Uesr("jack");
        //
        c.add(u1);
        //System.out.println(c.contains(u2));//false
        /*
        底层没有重写equals方法，会调用object类的equals方法
        object类的equals方法是用双等号比较内存地址
         */

        //重写equals之后会比较name
        System.out.println(c.contains(u2));

        Collection cc= new ArrayList();
        String s1= new String("hello");
        cc.add(s1);
        String s2= new String("hello");
        cc.remove(s2);
        System.out.println(cc.size());//0
        /*
        说明remove方法底层也调用了equals方法
         */
        c.remove(u2);
        System.out.println(c.size());//重写了equals方法
    }
}

class Uesr{
    private String name;

    public Uesr(){}

    public Uesr(String name) {
        this.name = name;
    }

    //重写equals，将来调用时，调的是重写的equals方法

    @Override
    public boolean equals(Object o) {
        if(o==this) return true;
        if (o == null ||!(o instanceof Uesr)) return false;
        Uesr uesr = (Uesr) o;
        //下面表示：如果名字一样表示同一个人，不再比较对象的内存地址
        return Objects.equals(name, uesr.name);
    }

}