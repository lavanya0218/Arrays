/*Question 7: Move all the zeros to the end of the array
Input: [1 ,0 ,2 ,3 ,0 ,4 ,0 ,1]
Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
*/

public class MoveZeroToTheEndOfArray {
    public static void main(String[] args) {
        int arr[] ={1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        MoveZeroToTheEnd(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void MoveZeroToTheEnd(int arr[]){
        int val = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                val++;
            }else{
                int temp = arr[i];
                arr[i] = 0;
                arr[i - val] = temp;
            }
        }
    }
}
