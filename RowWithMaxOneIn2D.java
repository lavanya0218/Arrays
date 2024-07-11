/*
 * Given a boolean 2D array of n x m dimensions where each row is sorted. Find the 0-based index of the first row that has the maximum number of 1's.

Example 1:
Input: 
N = 4 , M = 4
    Arr[][] = {{0, 1, 1, 1},
              {0, 0, 1, 1},
              {1, 1, 1, 1},
              {0, 0, 0, 0}}
Output: 2
Explanation: Row 2 contains 4 1's (0-based indexing).
 */
public class RowWithMaxOneIn2D {
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 1, 1},
              {0, 0, 1, 1},
              {1, 1, 1, 1},
              {0, 0, 0, 0}
            };
       System.out.println(MaxOneInArray(arr)); 
    }

    public static int MaxOneInArray(int arr[][]){
        int sum = 0; //keeps track of max 1's found in row
        int ans = -1; // store the index of the row with the maximum number of 1's
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 1){
                    count++;
                }
            }
//If count is greater than sum, it means the current row has more 1s than any of the previous rows checked.
            if(sum < count){
                sum = count;
                ans = i;
            }
        }
        return ans;
    }

}
