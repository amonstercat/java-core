package InnerClass;

//匿名类通常继承一个父类或实现一个接口

//继承父类实现匿名内部类
class Polygon {
    public void display() {
        System.out.println("在 Polygon 类内部");
    }
}

public class Anonymous {
    public void createClass() {
        Polygon p1 = new Polygon() {
            //内部类
            public void display() {
                System.out.println("在匿名类内部");
            }
        };
        p1.display();
    }
}

class Main1{
    public static void main(String[] args) {
   Anonymous  anonymous =new Anonymous();
   anonymous.createClass();
    }
}
