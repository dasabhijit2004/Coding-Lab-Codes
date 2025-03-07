// program to display Armstrong number between two intervals.

import java.util.Scanner;

public class Q14 {
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lower number: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter higher number: ");
        int number2 = scanner.nextInt();
        scanner.close();

        for(int i = number1; i<=number2; i++){
            if (isArmstrong(i)) {
                System.out.print(i +" ");
            }
        }
        
    }
}
