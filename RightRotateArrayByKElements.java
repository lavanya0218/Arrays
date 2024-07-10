/* Question 8: Rotate the array to the right by k steps.
Input: [1,2,3,4,5,6,7], k=3
Output: [5,6,7,1,2,3,4]
 */

public class RightRotateArrayByKElements {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k =3;
        RightRotate(arr, k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void RightRotate(int arr[], int k){
        int n = arr.length;
        k = k % n;
        for(int i=0 ;i<k ;i++){
            int lastElement = arr[n-1];
            for(int j=n-1  ;j>0 ;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = lastElement; // here arr[n-1] will not work because it cannot preserve the last element correctly
        }
    }
}
