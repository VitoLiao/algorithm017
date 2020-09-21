package Week_01;

/*
26. 删除排序数组中的重复项
 */
class HomeWork1 {
    private static int removeDuplicates(int[] nums) {
        if (nums.length <= 1)
            return nums.length;

        int i = 0;
        //j为快指针每次循环移动，i为慢指针，只有当两个值不同时才移动
        for (int j = 1; j < nums.length; j++)
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        return i + 1;
    }

    public static void main(String[] args) {
        // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);

        // 在函数里修改输入数组对于调用者是可见的。
        // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }

    }
}
