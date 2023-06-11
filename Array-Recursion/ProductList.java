package Array;

public class ProductList {

    static int[] square(int []arr,int n)
    {
        if(n == arr.length)
        {
            return new int[n];
        }
        int curr[] = square(arr, n + 1);
        curr[n] = arr[n] * arr[n];
        return curr;
    }
    public static void main(String[] args) {
        int[] res = square(new int[] { 1, 2, 3, 4, 5, 6 }, 0);
        for(int x:res)
        System.out.print(x + " ");
    }
}

