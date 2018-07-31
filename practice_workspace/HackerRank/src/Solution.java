import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long minimumSum = 0;
        long maximumSum = 0;
        
        for( int i = 0; i < arr.length; i++ ) {
            long sum = 0;
            for( int j = 0; j < arr.length; j++ ) {
                if( j != i ) {
                    sum = sum + arr[j];
                }
            }
            
            if( i == 0 ) {
                minimumSum = sum;
                maximumSum = sum;
            }
            
            if( sum < minimumSum ) {
                minimumSum = sum;
            } else if (sum > maximumSum) {
                maximumSum = sum;
            }
        }
        
        System.out.println(minimumSum + " " + maximumSum);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
