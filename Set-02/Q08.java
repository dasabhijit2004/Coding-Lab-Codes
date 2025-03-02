// program to check whether a number is prime or not.

import java.util.Scanner;

public class Q08 {
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

        if(prime(n) == 1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }
    }
}
