package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ImpleArrayList<E> {
    private  Object[] elementData;
    private  int size;
    private  static  final int DEFAULT_CAPACITY=10;
    public ImpleArrayList() {
        elementData=new Object[DEFAULT_CAPACITY]; //默认容量
    }
    public  ImpleArrayList(int capacity)
    {
        elementData=new Object[capacity];
    }
    public  void add(E element)
    {
        //数组扩容实质是将旧数组内容复制到一个新数组
        if (size==elementData.length)
        {
            Object[] newelementData = new Object[elementData.length<<1]; //左移一位
            System.arraycopy(elementData,0,newelementData,0,elementData.length);
            elementData=newelementData;  //引用指向新的数组，老数组被垃圾回收
        }
        elementData[size++]=element;
    }
    public E getElement(int  index)
    {
        return  (E) elementData[index];  //E是子类型，Object是父类型，Java支持向上转型，类型转子类型要强制转型
    }
  public  void setElement(E element,int index)
  {
      elementData[index]=element;
  }
  public  void remove(E element)
  {
      for (int i = 0; i < size; i++) {
          if (element.equals(getElement(i)))
          {
              remove(i);
          }
      }
  }

  // a b c d e f g h i
  // a b c e  f g h i       index=3
  public  void remove(int index)
  {
      if (index>0&&index<size)
      {
          System.arraycopy(elementData,index+1,elementData,index,elementData.length-index-1);
      }
  }


    //重写tostring方法
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
       stringBuilder.append(elementData[i]+",");
        }
        stringBuilder.append("]");
        return stringBuilder.toString(); //此处调用的是stringBuilder类的toString方法
    }

    public static void main(String[] args) {
        ImpleArrayList<String> impleArrayList=new ImpleArrayList();
        for (int i = 0; i <50; i++) {
            impleArrayList.add("name"+i);
        }
        //impleArrayList.setElement("niko",2);
        System.out.println(impleArrayList);
        //System.out.println(impleArrayList.getElement(0));
        impleArrayList.remove("name3");
        System.out.println(impleArrayList);
    }
}
