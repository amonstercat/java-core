package Thread.MethodTest;


public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        RunnerThread runnerThread = new RunnerThread();
        runnerThread.setName("兔子");
        RunnerThread runnerThread2 = new RunnerThread();
        runnerThread2.setName("乌龟");
        runnerThread.start();
        runnerThread2.start();
        // 让当前线程睡眠***毫秒 ，此处应针对主线程
        Thread.sleep(500);
        System.out.println("比赛结束");

    }
}
class RunnerThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i <= 100; i++) {
            System.out.println(getName()+"跑到了第"+i+"米");
        }
    }
}