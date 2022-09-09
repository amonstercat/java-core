package Thread.Concurrency;

public class BankProblem {
    public static void main(String[] args) {
        Account account=new Account(100,"结婚基金");
        Drawing you=new Drawing(account,50,"自己");
        Drawing girlfriend=new Drawing(account,100,"女友");
        you.start();
        girlfriend.start();

    }
}

class  Account{
     int  money;
     String  name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

//模拟银行取款
class  Drawing extends  Thread{
    Account account;
     int  drawMoney;
      int  nowMoney;
    public  Drawing(Account account ,int drawMoney,String name)
    {
        super(name);
        this.account=account;
        this.drawMoney=drawMoney;

    }
    @Override
    public  void run()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(account.money-drawMoney<0)
        {
            System.out.println(Thread.currentThread().getName()+"钱不够，无法取出");
            return;
        }
        account.money-=drawMoney;
        nowMoney+=drawMoney;
        System.out.println(account.name+"余额为"+account.money);
        System.out.println(Thread.currentThread().getName()+"手里的钱为"+this.nowMoney);
    }
}