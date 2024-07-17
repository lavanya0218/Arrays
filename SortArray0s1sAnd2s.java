import java.util.*;

public class SortArray0s1sAnd2s {
    public static void main(String[] args) {
        int arr[] = {2,1,0,0};
        SortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
    

    public static void SortArray(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
    
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, high--, mid);
                    break;
            }
        }
    }
    
}
