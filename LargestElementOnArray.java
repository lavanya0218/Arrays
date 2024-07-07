/*Question 5: Find the largest element in an array
Example 1: 
Input: arr = {5,8,2,0}
Output: 8
*/

//Both Array and ArrayList Time Complexity: O(n)

import java.util.ArrayList;

public class LargestElementOnArray {

    public static void main(String[] args) {
        int arr[] = {2,5,1,3,0};
        int val = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            //2 < 5 --> True update the value 5!
            if(val < arr[i]){
                val = arr[i];
            }
        }
        System.out.println(val);
    }
}

/* 
int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (maxVal < list.get(i)) {
                maxVal = list.get(i);
            }
        } 
*/
