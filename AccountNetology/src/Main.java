public class Main {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount();
        CreditAccount creditAccount = new CreditAccount(1000, 500);

        System.out.println("Simple Account Balance: " + simpleAccount.getBalance());
        System.out.println("Credit Account Balance: " + creditAccount.getBalance());

        simpleAccount.add(500);
        creditAccount.pay(200);

        System.out.println("Simple Account Balance after adding: " + simpleAccount.getBalance());
        System.out.println("Credit Account Balance after payment: " + creditAccount.getBalance());

        simpleAccount.transfer(creditAccount, 300);

        System.out.println("Simple Account Balance after transfer: " + simpleAccount.getBalance());
        System.out.println("Credit Account Balance after transfer: " + creditAccount.getBalance());
    }
}