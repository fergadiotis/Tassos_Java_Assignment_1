public class Chap3_ex311Test {

    public static void main(String[] args) {
        Chap3_ex311 theAccount = new Chap3_ex311(750.0);

        System.out.printf("initial balance: %s\n ", theAccount.getBalance());

        theAccount.withdraw(250.0);
        System.out.printf("Balance after withdrawal: %s\n ", theAccount.getBalance());

        theAccount.withdraw(1000.0);
        System.out.printf("Balance after second withdrawal: %s\n ", theAccount.getBalance());

    }
}