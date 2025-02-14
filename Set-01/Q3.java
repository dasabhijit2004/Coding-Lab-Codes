// Write a program to calculate the sum of n natural numbers.

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        int ans = number*(number + 1)/2;

        System.out.println(ans);
    }
}
