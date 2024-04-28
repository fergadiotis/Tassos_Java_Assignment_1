import java.util.Scanner;

public class Chap4_ex418 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the account number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter the balance at the beginning: ");
        int beginningBalance = input.nextInt();

        System.out.print("Enter the total of all items charged by the customer this month: ");
        int totalCharges = input.nextInt();

        System.out.print("Enter the total of all credits applied to the customer’s account this month: ");
        int totalCredits = input.nextInt();

        System.out.print("Enter the allowed credit limit: ");
        int creditLimit = input.nextInt();

        // calculate new balance

        int newBalance = beginningBalance + totalCharges - totalCredits;
        System.out.println("New Balance: " + newBalance);

        // If exceeds the credit limit
        if ((newBalance > creditLimit)) {
            System.out.println("Credit limit exceeded");

        }

    }
}