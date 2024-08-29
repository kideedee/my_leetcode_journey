import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else high = mid - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] strArray = s.split(",");
        int[] numbers = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            numbers[i] = Integer.parseInt(strArray[i].trim());
        }

        int target = sc.nextInt();
        System.out.println(searchInsert(numbers, target));
    }
}
