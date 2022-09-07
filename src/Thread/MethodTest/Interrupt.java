package Thread.MethodTest;

public class Interrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new myThread();
        t.start();
        Thread.sleep(10); // 主线程暂停10毫秒
        t.interrupt(); // 中断t线程
        t.join(); // 等待t线程结束
        System.out.println("end");
    }
}

class MyThread extends Thread {
    public void run() {
        int n = 0;
        while (! isInterrupted()) {
            n ++;
            System.out.println(n + " hello!");
        }
    }
}
