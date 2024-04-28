import java.util.Scanner;

public class Chap5_ex511 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of integer: ");
        int num = input.nextInt();

        System.out.print("Enter integer 1: ");
        int min = input.nextInt();

        for (int i = 2; i <= num; i++) {
            System.out.print("Enter integer" + i + ":");
            int nextInt = input.nextInt();

            if (nextInt < min) {
                min = nextInt;
            }
        }
        System.out.println("The smallest value is: " + min);
    }
}