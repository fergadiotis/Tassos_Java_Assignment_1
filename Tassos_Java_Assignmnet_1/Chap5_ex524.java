import java.util.Scanner;

public class Chap5_ex524 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of T: ");
        int T = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= T; i++){
            for (int j = 1; j <= T - i; j++){
                System.out.print("#");
            }

            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("#");
            }
            System.out.println();
        }

        for (int i = T - 1; i >= 1; i++){
            for (int j = 1; j <= T - i; j++){
                System.out.print ("#");
            }
            for (int j = 1; j <= T - i; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}