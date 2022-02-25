class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        int temp = target;
        for (int i = 0; i < nums.length; i++) {
            temp = target - nums[i];
            for (int j = i + 1; j < nums.length ; j++) {
                if (temp == nums[j]) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}