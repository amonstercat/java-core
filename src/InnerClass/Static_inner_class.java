package InnerClass;

public class Static_inner_class {
    public static void main(String[] args) {
   Outer1.StaticInnerClass  inn=new Outer1.StaticInnerClass();
   inn.hello();
    }
}

class Outer1{

    private  String name;
    Outer1(String nam)
    {
        this.name=nam;
    }
    //静态内部类
    static class StaticInnerClass
    {
         void hello(){
        System.out.println("测试静态内部类");
    }
    }
}