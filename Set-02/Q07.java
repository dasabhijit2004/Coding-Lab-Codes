// program to check whether a number is palindrome or not.

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int rev = 0;
        int rem;
        int num = n;
        while(n > 0){
            rem = n % 10;
            rev = (rev * 10)+rem;
            n = n/10;
        }
        if(rev == num){
            System.out.println("Plaindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
}
