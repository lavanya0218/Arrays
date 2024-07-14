/*
Question: Longest Consecutive Sequence in an Array
Input: [100, 200, 1, 3, 2, 4]
Output: 4
 */
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = {100, 200, 1, 3, 2, 4};
        int longestStreak = findLongestConsecutiveSequence(arr);
        System.out.println(longestStreak); 
    }

    public static int findLongestConsecutiveSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int longestStreak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
