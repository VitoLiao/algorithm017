package Week_01;

import java.util.HashMap;

/*
每日刷题：爬楼梯
 */
public class Solution1 {
    public static int climbStairs(int n) {
        if (n <= 2)
            return n;

        int a = 1;
        int b = 2;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    public int[] twoSum(int[] nums, int target) {

        if(null == nums)
            return nums;

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x), nums[i]};
            }
            map.put(x, nums[i]);
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
