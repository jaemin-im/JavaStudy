package javaStudy;

/**
 * Created by dsm2017 on 2017-06-13.
 */
public class Account {
    private long balance;

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws BalanceInsufficientException {
        if(balance < money) {
            throw new BalanceInsufficientException("잔고부족 : " + (money - balance) + " 모자람");
        }
        balance -= money;
    }
}
