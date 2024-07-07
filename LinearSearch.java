/*Question 6: Linear search
Example:
Input: arr[] ={10,29,8,18,28}
Output = 3
 */

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] ={10,29,8,18,28};
        int key = 18;
        linearSearch(arr, key);

    }

    public static void linearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
                if(arr[i] == key){
                    System.out.println(i);
                }
        }
    }
}
