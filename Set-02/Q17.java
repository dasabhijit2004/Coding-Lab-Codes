// program to check whether a number can be expressed as sum of two prime numbers.

import java.util.Scanner;

public class Q17 {

    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void checkSum(int n){
        boolean found = false;
        for(int i = 2; i<=n/2; i++){
            if(isPrime(i) && isPrime(n - i)){
                System.out.println("Can express as "+n+" = "+i+" + "+(n - i));
                found = true;
            }
        }

        if(!found){
            System.out.println("Can't express");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        checkSum(n);
    }
}
