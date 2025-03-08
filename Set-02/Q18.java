// program to find the sum of natural numbers using recursion.

import java.util.Scanner;

public class Q18 {

    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = sum(n);
        System.out.println("Sum = "+sum);
    }
}
