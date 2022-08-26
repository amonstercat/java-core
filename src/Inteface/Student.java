package Inteface;

public class Student  implements  Person {
    private  String name;
    public  Student(String name)
    {
        this.name=name;
    }
    public    String getname()
    {
         return  this.name;
    }
   public   void run()
    {
        System.out.println("student run"+" "+getname());
    }
}
class  Main{
    public static void main(String[] args) {
        Person p =new Student("niko");
        p.run();
    }
}