/*Question:  Given an array and a sum k, generate the subarray whose elements sum to k.
Input:
arr = {1, 7, 3, 9}, k = 10
Output: 7 3
*/

public class MaxSubarraySumEqualToK {
    public static void main(String[] args) {
        int arr1[] = {1, 7, 3, 9};
        int k1 = 10;
        MaxSubarraySumEqual(arr1, k1);
        
        int arr2[] = {2, 1, 3, 4, 5, 6};
        int k2 = 10;
        MaxSubarraySumEqual(arr2, k2);
    }

    public static void MaxSubarraySumEqual(int arr[], int k) {
        // Loop through each starting point of the subarray
        for (int start = 0; start < arr.length; start++) {
            int sum = 0;
            // Loop through each endpoint of the subarray
            for (int end = start; end < arr.length; end++) {
                sum += arr[end];
                if (sum == k) {
                    printSubarray(arr, start, end);
                }
            }
        }
    }
    private static void printSubarray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
