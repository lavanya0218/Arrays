/*
 Question: 
 Write a program to search an elment in the 2D Array.
 */

public class SearchAnElementIn2D {
    public static void main(String[] args) {
        int arr[][] ={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int k =12;
        boolean val = FindAnElementIn2D(arr, k);
        System.out.println(val);
    }

    public static boolean FindAnElementIn2D(int arr[][], int k){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i][j] == k){
                    return true;
                }
            }
        }
        return false;
    }
}
