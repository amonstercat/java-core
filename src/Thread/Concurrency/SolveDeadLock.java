package Thread.Concurrency;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SolveDeadLock {
    public static void main(String[] args) {
        //定义锁
        ReentrantLock   batterylock=new ReentrantLock();
        ReentrantLock   remotelock=new ReentrantLock();
        // 保证开电视和开空调这两个行为用到的是相同的两把锁
        Television television=new Television(batterylock,remotelock);
        Airconditioned airconditioned=new Airconditioned(batterylock,remotelock);
        new Thread(television,"niko").start();
        new Thread(airconditioned,"zywoo").start();
    }


}
class Television implements   Runnable{
    private ReentrantLock   battery;   //电池锁
    private ReentrantLock  remotecontroller;  //遥控器锁
    public Television(ReentrantLock battery, ReentrantLock remotecontroller) {
        this.battery = battery;
        this.remotecontroller = remotecontroller;
    }
    @Override
    public  void run()
    {
        remotecontroller.lock();
        System.out.println(Thread.currentThread().getName()+"拿到了遥控器,还缺电池");
         if(battery.isLocked())
         {
             remotecontroller.unlock(); //先释放自己的锁让其他线程使用
         }
         battery.lock();
         System.out.println(Thread.currentThread().getName()+"可以打开电视了");
         battery.unlock();
         if(remotecontroller.isLocked())
         {
             remotecontroller.unlock();
         }


    }
}

class Airconditioned implements   Runnable{
    private ReentrantLock   battery; //电池锁
    private  ReentrantLock   remotecontroller; //遥控器锁

    public Airconditioned(ReentrantLock battery, ReentrantLock remotecontroller) {
        this.battery = battery;
        this.remotecontroller = remotecontroller;
    }

    @Override
    public  void run()
    {
            battery.lock();
            System.out.println(Thread.currentThread().getName()+"拿到了电池,还缺遥控器");
            remotecontroller.lock();
            System.out.println(Thread.currentThread().getName()+"可以打开空调了");
           remotecontroller.unlock();
           battery.unlock();
    }
}
