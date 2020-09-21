package Week_01;

/*
189. 旋转数组
 */
class HomeWork2 {
    public static void rotate(int[] nums, int k) {

        if (null == nums)
            return;

        int n = nums.length;


        k %= n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;

        rotate(nums, k);

        for (int x: nums) {
            System.out.println(x);
        }
    }
}
