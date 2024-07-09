public class LeftRotateArrayByKPlaces {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7};
        int k = 2;
        LeftRotate(arr,k);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void LeftRotate(int arr[], int k){
        int n = arr.length;
        //ensures that the number of rotations does not exceed the length of the array
        k = k%n;
        //rotates the elements k times!
        for(int i=0;i<k;i++){
            int firstElemnt = arr[0];
            //moving each element of an array
            for(int j=0;j<n-1;j++){
                arr[j] = arr[j+1];
            }
            //store the 1st element at the end
            arr[n-1] = firstElemnt;
        }
    }
}
