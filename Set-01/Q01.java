// display prime numbers between two intervals.

import java.util.Scanner;

public class Q01{

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

        System.out.println("Enter the lower value: ");
        int low = sc.nextInt();
        System.out.println("Enter the upperr value: ");
        int high = sc.nextInt();

        for(int i = low; i<=high; i++){
            if(prime(i) == 1){
                System.out.print(i+" ");
            }
        }
    }
}
