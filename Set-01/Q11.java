// Write a program to display the sequence 14, 28, 20, 40, 32, 64, .......................

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Enter a positive number");
        }
        else{
            int l = 14;
            int m = 1;
            
            for(int i = 0; i<n; i++){
                if(i % 2 == 0){
                    System.out.print(l+" ");
                }
                else{
                    System.out.print(l*2+" ");
                    l += m*6;
                    m++;
                }
            }
        }
    }
}
