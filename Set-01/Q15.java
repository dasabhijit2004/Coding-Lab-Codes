// Write a program to display the sequence BCA1, BCB2, BCC3, BCD4, .....................

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements(between 1 and 26): ");
        int n = sc.nextInt();

        if(n <= 0 || n > 26){
            System.out.println("Enter a number between 1 and 26");
        }
        else{
            for(int i = 1; i<=n; i++){
                System.out.print("BC"+(char)(64+i)+i+" ");
            }
        }
    }
}
