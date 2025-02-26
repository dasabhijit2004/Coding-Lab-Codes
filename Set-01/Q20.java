// Write a program to display the series 0, 0, 2, 1, 4, 2, 6, 3, 8, 4,............................

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
            else{
                System.out.print((i-1)/2+" ");
            }
        }
        System.out.println();
    }
}
