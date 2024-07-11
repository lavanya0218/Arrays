/*
Write a program to remove duplicates from Sorted Array and Return K where K is the Last position of distinct element.
Example 1: 

Input: arr[1,1,2,2,2,3,3]
Output: arr[1,2,3,_,_,_,_]
 */

public class RemoveDuplications {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = RemoveDupli(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i = k; i < arr.length; i++) {
            System.out.print("_ ");
        }

    }   
    public static int RemoveDupli(int nums[]){
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
