// Write a program to display the sequence A1, B2, C4, D8, E16, F32, .................

import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        if(n <= 0 || n >= 26){
            System.out.println("Enter number > 0 and < 26");
        }
        else{
            for(int i = 0; i<n; i++){
                System.out.print((char)(i+65)+""+(int)Math.pow(2,i)+" ");
            }
        }
    }
}
