import java.util.Scanner;

public class Chap2_ex232 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int negative = 0;
        int positive = 0;

        for (int i = 0; i < 3; i++){
            System.out.print("Enter an integer (program ends if you enter 0):");
            int data = input.nextInt();

            if (data < 0){
                negative++;
            }
            else if (data > 0){
                positive++;
            } else {
                //Zero value
            }
            
        }

        System.out.println("Number of positive numbers: " + positive);

        System.out.println("Number of negative numbers: " + negative);

        System.out.println("Number of zeros numbers: " + (5 - positive - negative));

    }
}