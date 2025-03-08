// program to find factorial of a number using recursion.

import java.util.Scanner;

public class Q19 {

    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factorial: "+factorial(n));
    }
}
