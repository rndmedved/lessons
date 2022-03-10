package lessons.leetcode.test1;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] test = {2,9,11,15};
        int target = 9;
        Solution resolution = new Solution();
        System.out.println(Arrays.toString(resolution.twoSum(test,target)));
    }
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for(int i = 0; i < nums.length - 1; i++)
            if (nums[i] + nums[i+1] == target) {
                solution[0] = i;
                solution[1] = i + 1;
                return solution;
            }
        return solution;
    }
}