package com.zhongger;

/**
 * https://leetcode.cn/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
 */
public class RemoveElementSolution {
    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        while (right < nums.length) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(RemoveElementSolution.removeElement(nums, val));
    }
}
