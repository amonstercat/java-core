package Polymorphism;

public class JNC  extends  Wine {
    /**
     * 子类重载父类方法
     *  父类中不存在该方法，向上转型后，父类是不能引用该方法的
     *
     */
    public void fun1(String a ){
        System.out.println("JNC - Fun1...");
        fun2();
    }
    /**
     * 子类重写父类方法
     * 指向子类的父类引用调用fun2时，必定是调用该方法
     */
    public void fun2(){
        System.out.println("JNC -Fun2...");
    }
}
