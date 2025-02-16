// Write a program to display the sequence A1, B2, C3, ...., Y25, Z26, A1, B2, ...............

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Enter number > 0");
        }
        else{
            for(int i = 0; i<n; i++){
                System.out.print((char)((i%26)+65)+""+((i%26)+1)+" ");
            }
        }
    }
}
