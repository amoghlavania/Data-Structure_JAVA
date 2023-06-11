package Array;

public class UpperCase {

    static void solve(String[] arr,String[] res,int n)
    {
        if(n== arr.length)
        {
            return;
        }
        String ans = arr[n];
        ans = ans.toUpperCase();
        res[n] = ans;
        solve(arr, res, n+1);
    }
    public static void main(String[] args) {
        String[] arr = { "foo", "bar", "world" };
        String[] res = new String[arr.length];
        solve(arr, res, 0);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(res[i] + " ");
        }
    }
}

