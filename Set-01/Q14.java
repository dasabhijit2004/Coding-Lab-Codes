// Write a program to display the sequence A, Z, B, X, ........................

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements(between 1 and 26): ");
        int n = sc.nextInt();

        char start = 'A';
        char end = 'Z';

        if(n <= 0 || n > 26){
            System.out.println("Enter a number between 1 and 26");
        }
        else{
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    System.out.print(start + " ");
                    start++;
                } else { 
                    System.out.print(end + " ");
                    end -= 2;
                }
            }
        }
    }
}
