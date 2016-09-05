package com.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * 46 Permutation
 * Created by dengshun on 16-9-5.
 */

public class Permutation {
    private static void dfs(int i, int[] num,List<List<Integer>> result) {
        if(i==num.length) {
            List<Integer> tmp = new ArrayList<>();
            for(int j:num) {
                tmp.add(j);
            }
            result.add(tmp);
            return;
        }
        for(int j=i;j<num.length;j++) {
            int temp = num[i];
            num[i]  = num[j];
            num[j]  = temp;
            dfs(i+1,num,result);
            temp = num[i];
            num[i]  = num[j];
            num[j]  = temp;
        }
    }

    private static List<List<Integer>> permute(int[] num) {
        List<List<Integer>> result = new ArrayList<>();

        if(num==null||num.length==0) {
            return null;
        }
        dfs(0,num,result);
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> results;
        int[] nums = {1,2,3};
        results=permute( nums );
        System.out.println(results);
    }

}
