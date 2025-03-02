// program to find GCD and LCM of two numbers.

import java.util.Scanner;

public class Q11 {

    static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter a number: ");
        int n2 = sc.nextInt();

        int gcd = findGCD(n1, n2);
        System.out.println("GCD: "+gcd+" & LCM: "+findLCM(n2, n1, gcd));
    }
}
