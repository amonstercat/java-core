package Thread.Concurrency;

public class TicketProblem implements  Runnable {


    private  int  ticket_count=200;
    public static void main(String[] args) {

//        public Thread(Runnable target, String name) {
//            this(null, target, name, 0);
//        }
        //三个子线程共享一个对象
        Runnable  thread1= new TicketProblem();
        Runnable  thread2= new TicketProblem();
        new Thread(thread1,"小李").start();
        new Thread(thread1,"小王").start();
        new Thread(thread1,"黄牛").start();
    }

    @Override
    public void run() {

          while(true)
          {

              //对象锁
              synchronized (this)
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
}
