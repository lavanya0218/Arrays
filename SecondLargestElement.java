import java.util.*;;

public class SecondLargestElement {
    public static void main(String args[]){
        int arr[] = {2,4,5,6};
        SecondLargestNo(arr);
        SecondSmallesttNo(arr);
    }

    static void SecondLargestNo(int arr[]){
        Arrays.sort(arr);
        System.out.println("Second largest element is "+ arr[arr.length -2]);
    }
    static void SecondSmallesttNo(int arr[]){
        Arrays.sort(arr);
        System.out.println("Second smallest element is "+ arr[1]);
    }
}
