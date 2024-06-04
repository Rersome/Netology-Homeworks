public class CreditAccount extends Account {
    private long creditLimit;

    public CreditAccount(long initialBalance, long creditLimit){
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    @Override
    public boolean add(long amount) {
        balance += amount;
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (balance + creditLimit >= amount){
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
