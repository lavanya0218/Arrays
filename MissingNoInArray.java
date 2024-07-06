/*Question: 3 Find the missing number in an array
<Example 1:
   Input: nums = [3,0,1]
   Output: 2> */

public class MissingNoInArray {
    public static void main(String[] args) {
        int arr[] = {3,0,1};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=i){
                System.out.println(i);
            }
        }
       // sol2(arr);
    }

    public static void sort(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

/* 
    public static void sol2(int arr[]){
        int sum=0;
        int N=arr.length;
        for(int i=0; i<N; i++){
            sum+=arr[i];
        }

        int val = (N*(N+1))/2;
        int ans = val - sum;
        System.out.println(ans);
    } */
}
