package Static;

public class StaticTest {
    public static void print(){
        System.out.println("test static method");
    }
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0]=new Employee("niko",4000);
        staff[1]=new Employee("zywoo",8000);
        staff[2]=new Employee("twistzz",2000);
        for(Employee e:staff)
        {
            e.setId();
            System.out.println("name="+e.getName()+"id="+e.getId()+"salary="+e.getSalary());
        }
        int n = Employee.getNextId(); // 通过类名直接调用静态方法
        System.out.println("Next available id="+n);
        print();
        System.out.println(Employee.getNextId());
    }
}
class Employee {
    private static int nextId = 1;  //测试静态变量
    private  String name;
    private  double salary;
    private  int id;
    public Employee(String n, double s)
    {
      name=n;
      salary=s;
      id=0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    public   void setId()
    {
        id=nextId;
        nextId++;
    }
    //测试静态方法
  public static  int getNextId()
  {
      return  nextId;
  }
    public static void main(String[] args) {
        //unit test
        Employee e= new Employee("curry",100);
        System.out.println(e.getName()+" "+e.getSalary()+" "+ getNextId());
    }
}