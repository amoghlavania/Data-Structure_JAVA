public class ThirdLargestElement {
    public static void main(String[] args) {
        int arr[] = {1000,20,900,10,1,444};
        int firstLargest = 0;
        int secondLargest = -1;
        int thirdLargest = -1;
        // get the first largest
        for(int i= 1; i<arr.length; i++){
            if(arr[i]>arr[firstLargest]){
                firstLargest = i;
            }
        }
        // now get the second largest
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=arr[firstLargest]){
                if(secondLargest==-1){
                    secondLargest = i;
                }
                else if (arr[i]>arr[secondLargest]){
                    secondLargest = i;
                }
            }
        }
        //now get the third largest
        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=arr[firstLargest] && arr[i]!=arr[secondLargest]){
                if(thirdLargest==-1){
                    thirdLargest=i;
                }
                else if (arr[i]>arr[thirdLargest]){
                    thirdLargest = i;
            }
        }
    }
        System.out.println("First Largest "+arr[firstLargest]);
        System.out.println("Second Largest "+arr[secondLargest]);
        System.out.println("Third Largest "+arr[thirdLargest]);


    }
}