package Collection;

public class ImpleHashMap {
    HashNode[] table;  //位桶数组

    public ImpleHashMap() {
        table=new HashNode[16];  //最终有16个链表
    }

    public  void put(Object key, Object value)
    {
        HashNode newNode=new HashNode();
        newNode.hash=myHash(key.hashCode(),table.length);
        newNode.key=key;
        newNode.value=value;
        HashNode  tempNode=table[newNode.hash];//用来遍历特定的桶,让tempNode指向表头
        if (table[newNode.hash]==null)
        {
            //此桶为空，则直接把newNode加进去
            table[newNode.hash]=newNode;
        }else {
            //此桶不为空，则遍历
            while(tempNode!=null&&tempNode.next!=null)
            {
              tempNode=tempNode.next;
              tempNode.next=newNode;
            }
        }
    }
    public  int myHash(int v,int length)
    {
        return v&(length-1);  //直接位运算 效率更高
    }

    @Override
    public  String  toString()
    {
        StringBuilder sb=new StringBuilder("{");
        for (int i = 0; i < table.length; i++)
        {
            HashNode temp=table[i];
            while ((temp!=null))
            {
                sb.append(temp.key+":"+temp.value);
                temp=temp.next;
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public static void main(String[] args) {
           ImpleHashMap impleHashMap=new ImpleHashMap();
           impleHashMap.put(1,"zywoo");
           impleHashMap.put(2,"simple");
           impleHashMap.put(3,"niko");
           impleHashMap.put(4,"magisk");
           impleHashMap.put(5,"hunter");
         System.out.println(impleHashMap);
    }
}

class  HashNode{
    int hash;  //存储每个Key的hash值
    Object key ;
    Object value;
    HashNode next;
}