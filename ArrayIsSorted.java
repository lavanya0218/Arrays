//Array --> <It's a linear data structure that collects elements of the same data type and stores them in contiguous and adjacent memory locations.>

// Question:1 Check if an array is sorted <We will check every element with its previous element if the previous element is smaller than or equal to the current element then we will move to the next index.>
import java.util.Scanner;

public class ArrayIsSorted{
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        //Input Loop
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        Arraysort(arr, size);
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void Arraysort(int arr[], int size){
        boolean flag;
        int temp=0;
        for(int i=0; i<size-1; i++){
            flag = false;
            for(int j=0; j<size-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            
        if(!flag){
            break;
        }
        }
    }
}