package InnerClass;

 class Main {
    public static void main(String[] args) {
      Outer outer=new Outer("outer !"); //外部类对象
        /*内部类对象不能独立存在，必须依附于一个外部类的实例对象 */
      Outer.Inner inner =  outer.new Inner();
        System.out.println(outer.name);
        inner.test();
    }
}

public class  Outer {
     String name;
     public  Outer(String  name)
     {
       this.name=name;
     }
    class  Inner{
         void test ()
         {
             System.out.println("inner  method test    "+"其对应外部类对象为"+Outer.this.name);
         }
    }
}