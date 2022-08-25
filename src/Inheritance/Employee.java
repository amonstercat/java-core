package Inheritance;

import java.time.LocalDate;

public class Employee  {
  private  String name;
  private double salary;
//  private LocalDate hireday;
   public Employee(String nam,double sal)
   {
       this.name=nam;
       this.salary=sal;
   }

   public  Employee()
   {

   }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public  void raiseSalary(double byPercent)
    {
        double raise=salary*byPercent/100;
        salary+=raise;
    }
}
