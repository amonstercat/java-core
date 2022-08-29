package Thread;

//一个java程序就是一个JVM进程，JVM启动主线程执行main方法
// 在main()方法下又可以启动其他多个线程
public class Main {
    public static void main(String[] args) {
        Thread t1 = new Mythread();  //父类对象指向子类引用
        t1.start();
        /* 如果直接调用run()方法：
        相当于执行了一个普通的java方法，并没有开启新的线程
        下一行代码实际上是在main()方法中又调用了run()方法，
        打印输出语句是在main线程中进行的，并没有开启新线程
         */
       // t1.run();

       Runnable t2 = new MyRunnable("Thread a");
       MyRunnable t3 = new MyRunnable("Thread b");
        new Thread(t2).start();  //简略写法
       Thread thread3=new Thread(t3);
        thread3.start();  //完整写法

        /*实现Runnable接口创建线程最终也要借助Thread类
       如果通过继承Thread类创建线程，同时也直接继承了start方法()，
    但是如果使用Runnable接口创建线程，并没有start方法可以调用，
    因此还需要借助Thread类调用start()，要想启动多线程，一定依靠Thread类完成
        */
        Thread t4 =new Thread(new MyRunnable("Thread c"));
        t4.start();

    }
}

//继承Thread类 重写run()方法
class Mythread extends  Thread{

    @Override
    public void run() {
        System.out.println("继承Thread开启子线程");
    }
}

//实现runnable接口,重写run()方法
 class MyRunnable implements  Runnable{
    private  String name;
     public MyRunnable(String name){
         this.name=name;
     }

    @Override
    public void run() {
        System.out.println(this.name+"使用runnable开启子线程");
    }

     @Override
     public String toString() {
         return "MyRunnable{" +
                 "name='" + name + '\'' +
                 '}';
     }
 }