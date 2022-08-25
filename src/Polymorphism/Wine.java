package Polymorphism;

public class Wine {
    public void fun1(){
        System.out.println("Wine -Fun1.....");
        fun2();
    }
    public void fun2(){
        System.out.println("Wine -Fun2...");
    }

    public static void main(String[] args) {
        Wine wine =new Wine();
        wine.fun1();
    }
}
