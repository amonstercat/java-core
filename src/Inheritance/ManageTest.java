package Inheritance;
public class ManageTest {

    public static void main(String[] args) {
        Manager boss= new Manager("carl",8000);
        Manager boos2=new Manager("niko",10000);
        boss.setBonus(500);
        Employee[] staff= new Employee[3];
        staff[0]=boss;  //boss属于manager类，而manager类又是子类
        staff[1]=new Employee("harry",5000);
        staff[2]=new Employee("curry",4000);
        for(Employee e: staff)
        {
            System.out.println("name="+e.getName()+" salary="+e.getSalary());
        }
        boos2.raiseSalary(50);
        System.out.println(boos2.getSalary());
        Employee e1 =new Employee();
        Employee e2=new Employee();
        Employee e3=e1;
        System.out.println(e1.hashCode()+"----"+e2.hashCode()+"----"+e3.hashCode());
        String str="a";
        System.out.println(str);
        System.out.println(str.hashCode());
    }

}
