package list.singlelink;

/**
 * 单链表中的节点
 *
 * node中两部分：
 *      节点的数据
 *      下一个节点的内存地址
 */
public class Node {
    Object element;//存储的数据
    Node next;//下一个节点的内存地址
    //测试
    public Node(){

    }

    public Node(Object element,Node next){
        this.element=element;
        this.next=next;
    }


}
