package Abstract;

public abstract class Animal {
   abstract void makeSound();

    public void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {

    public void makeSound() {
        System.out.println("Bark bark");
    }
    public  void eat()
    {
        System.out.println("重写后的dog can eat");
    }

    //如果是重载，则调用父类方法，如果是重写，则调用子类方法
    public  void eat(String s)
    {
        System.out.println("重载后的dog can eat");
    }
}
 class Main {
    public static void main(String[] args) {
        Animal d1 = new Dog();
        d1.makeSound();
        d1.eat();
    }
}
