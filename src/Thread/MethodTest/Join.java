package Thread.MethodTest;

public class Join {
    public static void main(String[] args)  throws  InterruptedException{
      // 创建子线程
        Thread t1=new Thread(){
             public  void run()
             {
                 for(int i=0;i<=100;i++)
                 {
                     System.out.println("子线程t1is running"+" "+i+"%");
                 }
             }
        };
        t1.start();  //启动t1线程后，t1和main线程并发执行
        for(int i=0;i<=100;i++)
        {
            System.out.println("main线程is running"+" "+i+"%");
            if(i==50)
            {
                t1.join();  //阻塞其他线程，让t1先执行  join可以翻译为插入，插队
            }

        }
    }
}
