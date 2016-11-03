package com.LeetCode;

/**
 * 307. Range Sum Query - Mutable
 * Created by dengshun on 16-11-3.
 */
public class NumArray {
    private int[] num;
    private int[] sums;
    public NumArray(int[] nums) {
        this.num = nums;
        sums = new int[nums.length];
        sums[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            sums[i] = sums[i-1]+nums[i];
        }
    }

    void update(int i, int val) {
        int temp = val - num[i];
        for(int j=i;j<num.length;j++){
            sums[j] += temp;
        }
        num[i] = val;
    }

    public int sumRange(int i, int j) {
        if(i == 0)
            return sums[j];
        else
            return sums[j]-sums[i-1];
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{1,3,5,7,9});
        System.out.println(numArray.sumRange(0,2));
        numArray.update(1,2);
        System.out.println(numArray.sumRange(0,2));
    }
}
