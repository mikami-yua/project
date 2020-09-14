package list.singlelink;

public class Link {
    //头节点
    Node header= null;

    int size=0;

    public int size(){
        return size;
    }

    //向链表添加元素
    public void add(Object data){
        //next指向新的对象
        if(header==null){
            //此时链表为空
            header=new Node(data,null);
            //头节点是末尾节点
        }
        else {//头不空
            //找出当前末尾节点
            Node currentLastNode=findLast(header);
            currentLastNode.next=null;
        }
        size++;
    }

    /**
     * 寻找末尾节点
     * @param header 带查找的链表的头
     * @return
     */
    private Node findLast(Node header) {
        if(header.next==null){
            return header;
        }
        return findLast(header.next);//递归查找末尾节点
    }

    //从链表中删除的方法
    public void remove(Object obj){

    }

    //修改
    public void modify(Object obj){

    }

    //获取-----返回下标
    public int find(Object obj){

        return -1;
    }

}
