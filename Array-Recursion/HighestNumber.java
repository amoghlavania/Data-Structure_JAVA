package Array;

public class HighestNumber {
    public static void main(String[] args) {
        int[] arr = { 11, 2, 3, 4, 5, 8, 7, 9, 10 };
             int a = maxout(arr, 0, 0);
             System.out.println(a);
         }
     
         public static int maxout(int[] arr, int in, int max) {
             if (in == arr.length) {
                 return max;
             }
             int cur = arr[in];
             if (cur > max) {
                 max = cur;
             }
             return maxout(arr, in + 1, max);
     }
 
 }
 
