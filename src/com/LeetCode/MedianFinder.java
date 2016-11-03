package com.LeetCode;

/**
 * 295. Find Median from Data Stream
 * Created by dengshun on 16-9-20.
 */
public class MedianFinder {
    private static double sum=0.0;
    private static int i=0;
    // Adds a number into the data structure.
    private void addNum(int num) {
        sum+=num;
        i++;
    }
    // Returns the median of current data stream
    private double findMedian() {
        return sum/i;
    }

    public static void main(String[] args){
        MedianFinder mf = new MedianFinder();
        mf.addNum(1);
        mf.addNum(0);
        mf.addNum(0);
        System.out.println(mf.findMedian());
    }
}
