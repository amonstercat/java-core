package Inheritance;

public class Manager  extends  Employee{

    private  double bonus;  //子类特有属性
   public  Manager(String name,double salary)
   {
       super(name,salary);
       bonus=0;
   }
     public  double getSalary()
     {
         //使用super调用父类的私有属性与方法
         double baseSalary=super.getSalary();
         return  baseSalary+bonus;
     }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
