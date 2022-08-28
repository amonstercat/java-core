package InnerClass;

public class Anonymous_inner_class {
    public static void main(String[] args) {
        //匿名内部类，依赖于某个实例，继承实现
        Person person =new Person(){
         public   void method(){
                System.out.println("匿名内部类重写父类方法");
            }
        };
         person.method();
    }
}

class Person
{
    void method()
    {
        System.out.println("调用父类方法");
    }
}