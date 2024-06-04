public abstract class Account {
    protected int balance;

    public int getBalance() {
        return balance;
    }

    public abstract boolean add(long amount);

    public abstract boolean pay(long amount);

    //public abstract boolean transfer(Account account, long amount);

    public boolean transfer(Account account, long amount) {
        if (pay(amount)) {
            if (account.add(amount)){
                return true;
            } else {
                balance += amount;
            }
        }
        return false;
    }
}
