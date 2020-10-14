package Week_02;

import java.util.HashMap;

public class HomeWork2 {
    /**
     原本使用双循环O(n^2)的方式，后来借用HashMap存储，时间复杂度降低到O(n),map.containsKey复杂度可视为O(1)
     */
    public int[] twoSum(int[] nums, int target) {

        if(null == nums)
            return nums;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(x, i);
        }

        return null;
    }
}
