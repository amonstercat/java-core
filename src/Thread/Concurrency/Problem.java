package Thread.Concurrency;

import java.util.PrimitiveIterator;

public class Problem  implements  Runnable {

    private  int  ticket_count=20;
    public static void main(String[] args) {

//        public Thread(Runnable target, String name) {
//            this(null, target, name, 0);
//        }
        //三个子线程共享一个对象
        Runnable  thread1= new Problem();
        new Thread(thread1,"小李").start();
        new Thread(thread1,"小王").start();
        new Thread(thread1,"黄牛").start();
    }

    @Override
    public void run() {
          while(true)
          {
              if (ticket_count<0)
              {
                  break;
              }
              System.out.println(Thread.currentThread().getName()+"子线程拿到了第"+ticket_count+"张票");
              ticket_count--;
          }
    }
}
