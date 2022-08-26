package Inteface;

public interface Person {
    public String getname();
    //default方法可以有实现
    default  void run()
    {
        System.out.println(getname()+"run");
    }
}
