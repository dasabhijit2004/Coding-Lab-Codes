// program to count number of digits in an integer.

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }
        System.out.println("No of digits: "+count);
    }
}
