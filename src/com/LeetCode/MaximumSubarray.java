package com.LeetCode;

/**
 * 53. Maximum Subarray
 * Created by dengshun on 16-10-25.
 */
public class MaximumSubarray {

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

    private static int maxSubArray(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int global = nums[0];
        int local = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>local+nums[i]) {
                System.out.println(i + "1");
            }
            local = Math.max(nums[i],local+nums[i]);
            global = Math.max(local,global);
        }
        return global;
    }
}
