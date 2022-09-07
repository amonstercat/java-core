package Thread.MethodTest;


//JVM无需等待守护线程运行结束
public class Daemon {
    public static void main(String[] args) {
        God god =new God();
        Person person=new Person();
        Thread thread=new Thread(god);
        thread.setDaemon(true);
        thread.start();
        new Thread(person,"普通人").start();
    }
}

class  God implements  Runnable
{

    @Override
    public void run() {
          while (true)
          {
              System.out.println("上帝是永恒的");
          }
    }
}
class  Person implements  Runnable
{

    @Override
    public void run() {
        for (int i = 0; i < 365; i++) {
            System.out.println("人的一生还在进行中");
        }
        System.out.println("人的一生结束了");
    }
}
