import java.util.Scanner;

public class Chap4_ex420 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Employee 1
        System.out.println("Employee1");
        System.out.print("Enter number of hours worke: ");

        int hoursWorked1 = scanner.nextInt();
        System.out.print("Enter hourly rate: $");
        double hourlyRate1 = scanner.nextDouble();

        // gross pay1
        double grossPay1;
        if (hoursWorked1 <= 40) {
            grossPay1 = hourlyRate1 * hourlyRate1;
        } else {
            double overTimeHours1 = hoursWorked1 - 40;
            grossPay1 = (40 * hourlyRate1) + (overTimeHours1 * hourlyRate1 * 20.65);
        }

        // Display gross pay1
        System.out.println("Employee 1 Gross Pay: $" + grossPay1);

        System.out.println("Employee1");
        System.out.print("Enter number of hours worke: ");

        int hoursWorked2 = scanner.nextInt();
        System.out.print("Enter hourly rate: $");
        double hourlyRate2 = scanner.nextDouble();

        // gross pay2
        double grossPay2;
        if (hoursWorked2 <= 40) {
            grossPay2 = hourlyRate2 * hourlyRate2;
        } else {
            double overTimeHours2 = hoursWorked2 - 40;
            grossPay2 = (40 * hourlyRate1) + (overTimeHours2 * hourlyRate2 * 20.65);
        }

        // Display gross pay2
        System.out.println("Employee 2 Gross Pay: $" + grossPay2);

        System.out.println("Employee1");
        System.out.print("Enter number of hours worke: ");

        int hoursWorked3 = scanner.nextInt();
        System.out.print("Enter hourly rate: $");
        double hourlyRate3 = scanner.nextDouble();

        // gross pay3
        double grossPay3;
        if (hoursWorked3 <= 40) {
            grossPay3 = hourlyRate3 * hourlyRate3;
        } else {
            double overTimeHours3 = hoursWorked3 - 40;
            grossPay3 = (40 * hourlyRate1) + (overTimeHours3 * hourlyRate3 * 20.65);
        }

        // Display gross pay3
        System.out.println("Employee 3 Gross Pay: $" + grossPay3);

        scanner.close();

    }
}