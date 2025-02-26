// Read a number from STDIN, then display the sequence given below:
// Input: 52934
// Output: A5, B2, C9, D3, E4

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        String num = sc.next();

        for(int i = 0; i<num.length(); i++){
            System.out.print((char)(65+i)+""+num.charAt(i)+" ");
        }
        System.out.println();
    }
}
