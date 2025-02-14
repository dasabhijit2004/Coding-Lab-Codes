// 21, 9, 21, 11, 21, 13, 21, .................

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements: ");
        int n = sc.nextInt();

        int s = 9;

        for(int i = 0; i<n; i++){
            if(i % 2 == 0){
                System.out.print("21 ");
            }
            else{
                System.out.print(s+" ");
                s += 2;
            }
        }
    }
}
