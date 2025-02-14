// 7, 10, 8, 11, 9, 12, .................

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();
        int first = 7;
        int second = 10;

        for(int i = 0; i<n; i++){
            if(i%2 != 0){
                System.out.print(first+" ");
                first++;
            }
            else{
                System.out.print(second+" ");
                second++;
            }
        }        
    }
}
