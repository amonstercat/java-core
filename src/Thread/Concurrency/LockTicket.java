package Thread.Concurrency;

import java.util.concurrent.locks.ReentrantLock;

public class LockTicket {
    public static void main(String[] args) {
       Runnable  user=new TicketRunnable();
        new Thread(user,"niko").start();
        new Thread(user,"zywoo").start();
        new Thread(user,"simple").start();

    }
}

/*
* lock锁必须锁的是同一个对象
*使用lock()进行加锁  unlock()进行解锁
*若代码出现异常 程序不会自动解锁，故需使用try catch finally进行处理
*
 */
class  TicketRunnable  implements  Runnable{
           static volatile   int num=1;
           static ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {

            while (num<=500)
            {
                lock.lock();
                try {
                    if (num<=500)
                    {
                        System.out.println(Thread.currentThread().getName()+"买到了第"+num+"张票");
                        num++;
                    }else {
                        System.out.println("票已经卖完了");
                    }
                //    int a=10/0;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                } finally {
                    lock.unlock();
                }

            }


    }
}
