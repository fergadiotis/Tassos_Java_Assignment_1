import java.util.Scanner;

public class Chap2_ex217 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum, product, average;
        int smallest, largest;

        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();

        // Sum
        sum = num1 + num2 + num3;

        // Product
        product = num1 * num2 * num3;

        // Average
        average = sum / 3;

        // Smallest and Largest number

        smallest = num1;
        largest = num1;

        if (num2 > largest)
            largest = num2;
        if (num3 > largest)
            largest = num3;

        if (num2 > largest)
            smallest = num2;
        if (num3 < smallest)
            smallest = num3;

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

    }
}