// program to find the sum of first n prime numbers.

import java.util.Scanner;

public class Q19 {

    static int prime(int num){
        if(num < 2){
            return -1;
        }
        else if(num > 2){
            for(int i = 2; i<=num/2; i++){
                if(num % i == 0){
                    return -1;
                }
            }
            return 1;
        }
        else if (num == 2){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of primes to be calculated: ");
        int n = sc.nextInt();

        int count = 0, sum = 0, num = 2;

        while(count < n){
            if(prime(num) == 1){
                count++;
                sum += num;
            }
            num++;
        }

        System.out.println("Sum = "+sum);
    }
}
