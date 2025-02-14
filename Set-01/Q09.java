// 1, 1, 5, 5, 9, 9, 13, 13, .............................

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            if(i % 2 == 0){
                int s = (i * 2) + 1;
                System.out.print(s+" ");
            }
            else{
                int s = (i * 2) - 1;
                System.out.print(s+" ");
            }
        }
    }
}
