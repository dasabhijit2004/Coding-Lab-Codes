// Program to display the sequence AMM, COO, EQQ, ..........

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements(between 1 and 6): ");
        int n = sc.nextInt();

        char first = 'A';
        char second = 'M';
        char third = 'M';
        if(n > 0 && n < 6){
            for (int i = 0; i < n; i++) {
                System.out.print(first + "" + second + "" + third);
                if (i < n - 1) {
                    System.out.print(", ");
                }
                first += 2;
                second += 2;
                third += 2;
            }
        }
        else{
            System.out.println("Enter n between 1 & 6");
        }
    }
}
