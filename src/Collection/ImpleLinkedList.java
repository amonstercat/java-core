package Collection;

import java.util.LinkedList;

public class ImpleLinkedList <E>{

    private  Node first;
    private  Node last;
    private  int      size;

    //添加节点
    public  void addNode(E e)
    {
       Node  node= new Node(e);
       if (first==null)
       {
           node.previous=null;
           node.next=null;
           first=node;
           last=node;
       }else {
           //尾插法建立链表
            node.previous=last;
            node.next=null;
            last.next=node;  //强调双向链表
            last=node;   //指针后移
       }
       size++;
    }

    // 删除节点   a->b->c->d->e->f    ---->  a->b->d->e->f
    public  void removeNode(int index)
    {
        Node node=first;
        for (int i = 1; i < index-1; i++)
        {
            node=node.next;
        }
        node.next.previous=node;
        node.next=node.next.next;
    }

    //插入节点
    public  void insertNode(int index,E e)
    {
        Node tempNode=first;
        Node node=new Node(e);
        for (int i = 1; i < index-1; i++)
        {
           tempNode=tempNode.next;
        }
        node.next=tempNode.next;
        tempNode.next.previous=node;
        tempNode.next=node;
        node.previous=tempNode;

    }

    //获取节点
    public  E getNode(int index)
    {
        //a b c d e f g
        Node node=first;
        for (int i = 1; i < index; i++) {
               node=node.next;
        }
        return (E) node.element;
    }
       @Override
       public String toString()
       {
           StringBuilder stringBuilder=new StringBuilder();
           Node tempNode=first;
           while (tempNode!=null)
           {
               stringBuilder.append(tempNode.element+",");
               tempNode=tempNode.next;
           }
           return  stringBuilder.toString();
       }


    public static void main(String[] args) {
        ImpleLinkedList<String> linkedList=new ImpleLinkedList();
        linkedList.addNode("zywoo");
        linkedList.addNode("simple");
        linkedList.addNode("twistzz");
        linkedList.addNode("dev1ce");
        System.out.println(linkedList+"   链表元素数量为"+linkedList.size);
       System.out.println(linkedList.getNode(3));
    //    linkedList.removeNode(2);
        linkedList.insertNode(3,"rain");
        System.out.println(linkedList);
    }
}
