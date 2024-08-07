import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        int a = 0, b = 0;
        int index1 = 0, index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            a = nums[i];
            index1 = i;
            b = target - a;
            if (map.containsKey(b)) {
                index2 = map.get(b);
                if(index1 == index2){
                    continue;
                }
                break;
            }
        }

        return new int[]{index1, index2};
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
