package Thread.MethodTest;

//test yield 礼让不一定成功！
public class Yield {
    public static void main(String[] args) {
      MyYield myYield =new MyYield();
       new Thread(myYield,"a").start();
       new Thread(myYield,"b").start();
    }
}

class  MyYield implements  Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        Thread.yield(); //礼让 ，将线程由运行态变为就绪态，然后重新抢占CPU资源
        System.out.println(Thread.currentThread().getName()+"线程结束执行");
    }
}
