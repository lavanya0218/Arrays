public class FindTheSecondSmallestAndSecondLargestEle {
    public static void main(String[] args) {
        int arr[] = {10, 2, 4, 7, 7, 5};
        int secondLargest = findSecondLargest(arr);
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("Second Largest: " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static int findSecondLargest(int arr[]) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Find the maximum value in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Find the second maximum value in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static int findSecondSmallest(int arr[]) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // Find the minimum value in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Find the second minimum value in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < secondMin && arr[i] > min) {
                secondMin = arr[i];
            }
        }

        return secondMin;
    }
}
