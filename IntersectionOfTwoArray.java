/*Question:4 <Find the intersection of two sorted array>

Example:
Input:
arr1: [1, 2, 3, 3, 4, 5, 6]
arr2: [3, 3, 5]
output: [3,3,5]
*/

import java.util.ArrayList;
public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 3, 4, 5, 6};
        int arr2[] = {3, 3, 5};
        ArrayList<Integer> output = IntersectingArr(arr1,arr2);
        for(int val:output){
            System.out.println(val+ " ");
        }
    }

    public static ArrayList<Integer> IntersectingArr(int arr1[], int arr2[]){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int i=0;
        int j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] == arr2[j]){
                arr.add(arr2[j]);
                i++; // move to the nxt element
                j++;
            }else if(arr1[i]<arr2[j]){
                i++; //if smaller cannot match any of the current or future elements! 
            }else{
                j++;
            }
        }
        return arr;
    }
}
