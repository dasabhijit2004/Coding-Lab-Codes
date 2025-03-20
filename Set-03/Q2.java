// Given an array of integers, sort the first half of the array in ascending order and second half in descending order. Take input from STDIN by scanf().

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr, 0, n / 2);
        Arrays.sort(arr, n / 2, n);
        
        for (int i = n / 2, j = n - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
