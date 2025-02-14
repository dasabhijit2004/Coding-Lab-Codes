// Write a program to calculate the power of a number.

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base: ");
        double base = sc.nextDouble();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();

        double ans = 1;

        for(int i = 1; i<=power; i++){
            ans *= base;
        }

        System.out.println(ans);
    }
}
