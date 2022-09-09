package Thread.Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class DeadLock {

    //AtomicInteger
    public static void main(String[] args) {
        Tv tv=new Tv();
        AirCondition airCondition=new AirCondition();
        new Thread(tv).start();
        new Thread(airCondition).start();
    }
}
//常量 遥控器、电池都相当于类锁
class Tv implements   Runnable{
    @Override
    public  void run()
    {
           synchronized ("遥控器")
           {
               System.out.println("A拿到了遥控器,还缺电池");
               synchronized ("电池")
               {
                   System.out.println("A可以打开电视了");
               }
           }
    }
}

class AirCondition implements   Runnable{
    @Override
    public  void run()
    {
        synchronized ("电池")
        {
            System.out.println("B拿到了电池,还缺遥控器");
            synchronized("遥控器")
            {
                System.out.println("B可以打开空调了");
            }
        }
    }
}

