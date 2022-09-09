package Thread.Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class OperateRW {
    public static void main(String[] args) {
        new Thread(()->{
             new Operator().read();
        },"A"
                ).start();
        new Thread(()->{
            new Operator().write();
        },"C"
        ).start();
        new Thread(()->{
            new Operator().read();
        },"B"
        ).start();
        new Thread(()->{
            new Operator().write();
        },"D"
        ).start();
    }
}

class  Operator  extends Thread {
    static Lock  lock=new ReentrantLock();
    static ReentrantReadWriteLock readWriteLock=new ReentrantReadWriteLock();
    //读方法
    public  void read()
    {
        readWriteLock.readLock().lock();  //使用读锁
        System.out.println("线程"+Thread.currentThread().getName()+"开始读操作");
        //模拟真实读操作
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("线程"+Thread.currentThread().getName()+"完成读操作");
        readWriteLock.readLock().unlock();
    }

    //写方法
    public  void write()
    {
        readWriteLock.writeLock().lock();
        System.out.println("线程"+Thread.currentThread().getName()+"开始写操作");
        //模拟真实写操作
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("线程"+Thread.currentThread().getName()+"完成写操作");
     readWriteLock.writeLock().unlock();
    }
}