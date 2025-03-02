// program to find the sum of first n prime numbers.

import java.util.Scanner;

public class Q09 {
    static int prime(int n){
        if(n < 2){
            return 0;
        }
        else if(n == 2){
            return 1;
        }
        else{
            for(int i = 2; i<=n/2; i++){
                if(n % i == 0){
                    return 0;
                }
            }
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for(int i = 2; i<n; i++){
            if(prime(i) == 1){
                sum += i;
            }
        } 
        System.out.println("Sum of prime numbers: "+sum);
    }
}
