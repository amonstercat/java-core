package Thread.MethodTest;

//模拟倒计时
public class Sleep  implements  Runnable {


    @Override
    public void run() {
    }

    public static void countdown() throws InterruptedException {
        int count =10;
        while(true)
        {
            System.out.println(count);
            Thread.sleep(1000);
            count--;
            if (count<=0)
            {
                break;
            }
        }

    }

    public static void main(String[] args) throws InterruptedException {
          countdown();
    }
}
