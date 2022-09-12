package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Generics {
    public static void main(String[] args) {
        MyCollection<String> myCollection1= new MyCollection<String>(); //自定义一个String泛型
        MyCollection <Integer> myCollection2=new MyCollection<Integer>();//自定义一个Integer泛型
        myCollection1.setObjects("niko",0);
        myCollection2.setObjects(123456,1);
        System.out.println(myCollection1.getObjects(0));
        System.out.println(myCollection2.getObjects(0));
        System.out.println(myCollection2.getObjects(1));


        ArrayList<Object> arrayList =new ArrayList<>();
        //ArrayList实现了List接口、List接口又继承了Collection类、而Collection类又继承了Iterable类
        Collection<String> collection=new ArrayList<>(); //父类引用指向子类对象
       String str="spinx";
        collection.add("zywoo");
        collection.add("apex");
        collection.add(str);
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        collection.remove(str);
        System.out.println(collection.size());
    }

}
//自定义泛型
class MyCollection<E>{
    public Object[]  objects=new Object[5];
    public  void setObjects(E obj,int index)
    {
        objects[index]=obj;
    }
    public E  getObjects(int index)
    {
       return  (E) objects[index];
    }

}