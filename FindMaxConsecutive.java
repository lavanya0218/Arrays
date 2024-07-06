// Question 2:  maximum number of consecutive 1's in the array
/* Example 1:
Input: arr = [1,1,0,1,1,1]
Output: 3 */

public class FindMaxConsecutive {
    public static void main(String[] args) {
        int arr [] = {1,1,0,1,1,1,1,0,1};
        int count = 0;
        int maxCount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1){
                count+=1;
                maxCount = Math.max(maxCount, count);
            }else{
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
