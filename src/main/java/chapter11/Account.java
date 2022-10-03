package chapter11;

public class Account {
    private long balance;
    public Account(){}
    public long getBalance(){
        return balance;
    }
    public void deposit(int money){
        balance += money;
    }

    public void withdraw(int money) throws InsufficientException{
        if(balance < money) throw new InsufficientException(String.format("잔고 부족 %d 모자람", money - this.balance));
        balance -= money;
    }
}
