package Thread.MethodTest;

public class InterruptFlag {
    public static void main(String[] args) throws InterruptedException {
        FlagThread flagThread =new FlagThread();
        new Thread(flagThread,"flag").start();
       Thread.sleep(100);
       flagThread.running=false;
    }
}
class  FlagThread implements  Runnable{
  //  注意到HelloThread的标志位boolean running是一个线程间共享的变量。
  //  线程间共享变量需要使用volatile关键字标记，确保每个线程都能读取到更新后的变量值。
    public volatile boolean running = true;

    @Override
    public void run() {
        int n = 0;
        while (running) {
            n ++;
            System.out.println(n + " hello!");
        }
        System.out.println("end!");
    }
}
