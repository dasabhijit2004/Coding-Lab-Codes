// 1, 2, 2, 4, 8, 32, 256, ....................

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;
        int n3 = 0;

        System.out.print(n1+" "+n2);

        for(int i = 3; i<=7; i++){
            n3 = n1 * n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
        }

    }
}
