package com.LeetCode;

import java.util.HashSet;
import java.util.Set;

/**
 * 139. Word Break
 * Created by dengshun on 16-10-11.
 */
public class WordBreak {

    public static void main(String[] args){
        String s = "aaaaaaaa";
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("aaaaa");
        System.out.println(wordBreak(s,set));
    }

    private static boolean wordBreak(String s,Set<String> wordDict) {
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i = 0;i < s.length();i++){
            String sub = s.substring(0,i+1);  //sub.length == i+1;
            if(wordDict.contains(sub)){
                dp[i+1] = true;
            }else{
                for(int j = i;j>=0;j--){
                    if(wordDict.contains(sub.substring(j))){
                        if(dp[j]){
                            dp[i+1] = true;
                            break;
                        }
                    }
                }
            }
        }
        return dp[s.length()];
    }
}
