// 1, 2, 4, 7, 11, ...............

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();

        int s = 1;
        System.out.print(s+" ");
        for(int i = 1; i<n; i++){
            s += i;
            System.out.print(s+" ");
        }
    }
}
