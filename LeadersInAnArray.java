/*
Question:  
Given an array, print all the elements which are leaders. A Leader is an element that is greater than all of the elements on its right side in the array.
Input:
arr = [10, 22, 12, 3, 0, 6]
Output:
22 12 6
*/

import java.util.ArrayList;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6};
        ArrayList<Integer> ans = HighestElement(arr);
        System.out.println(ans);
    }

    public static ArrayList<Integer> HighestElement(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[arr.length - 1];
        ans.add(max);
        for(int i = arr.length - 2; i >= 0; i--){
            if(max <= arr[i]){
                max = arr[i];
                ans.add(max);
            }
        }
        return ans;
    }
    
}
