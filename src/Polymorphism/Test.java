package Polymorphism;

public class Test {
    public static void main(String[] args) {
        Wine a = new JNC();//  向上转型：父类引用指向子类对象
        JNC b= new JNC();
        b.fun1();
        a.fun1();
    }
}
