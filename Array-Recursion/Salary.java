package Array;

class Salary {

    public static void maxout(int[] arr, int in, double[] news) {
        if (in == arr.length) {
            return;
        }
        int cur = arr[in];
        news[in] = cur + (0.1 * cur);
        maxout(arr, in + 1, news);
    }

    public static void main(String[] args) {
         int[] arr = { 1, 2, 3, 4, 5, 8, 7, 9, 12 };
	        double[] res = new double[arr.length];
	        maxout(arr, 0, res);
	        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + "  ");
	        }
    }
}
