// program to display prime numbers between two intervals.

import java.util.Scanner;

public class Q12 {
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

        System.out.println("Enter lower value: ");
        int l = sc.nextInt();

        System.out.println("Enter higher value: ");
        int h = sc.nextInt();

        for (int i = l; i <= h; i++) {
            if(prime(i) == 1){
                System.out.print(i+" ");
            }
        }
    }
}
