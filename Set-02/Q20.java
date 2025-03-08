// program to find G.C.D using recursion.

import java.util.Scanner;

public class Q20 {

    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.println("G.C.D = "+gcd(n1, n2));        
    }
}
