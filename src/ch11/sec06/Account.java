package ch11.sec06;

public class Account {

    private long balance; // 잔고

    public Account() {}

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money; // 예금
    }

    // 출금
    public void withdraw(int meney) throws InsufficientException { // throws가 있으면 이 메소드를 호출한 곳에서 예외처리를 해야한다.
        if (balance < meney) {
            throw new InsufficientException("잔고가 부족합니다. " + (meney - balance) + "원 부족합니다.");
        }

        balance -= meney;
    }
}
