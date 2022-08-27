package Reflection;

public class Employee {
    private  String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Employee(String name) {
        this.name = name;
    }
}
class Main{
    public static void main(String[] args) {
        Employee e =new Employee("niko");
        Class  cl= e.getClass();  //getClass()返回一个Class类的对象
        System.out.println(cl.getName()+"  "+e.getName());
    }
}