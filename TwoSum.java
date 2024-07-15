/*Question: Given an array and a sum k, generate the subarray whose elements sum to k. and return it's index.
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
 */

public class TwoSum {
    public static void main(String[] args) {
        int arr [] = {3,2,4,6};
        int k = 6;
        sums(arr, k);
    }

    public static void sums(int arr[], int k){
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                if(sum == k && j-i>0){
                    printSum(i,j);
                }
            }
        }
    }

    public static void printSum(int start, int end){
        for(int i=start;i<=end;i++){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
