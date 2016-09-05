package com.LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 290 Word Pattern
 * Created by dengshun on 16-9-5.
 */
public class WordPattern {

    private static boolean wordPattern(String pattern, String str) {
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        char[] p=pattern.toCharArray();
        String[] s=str.split(" ");
        if(p.length!=s.length){
            return false;
        }
        for(int i=0;i<p.length;i++)
        {
            if(map.containsKey(p[i])) {
                if (!s[i].equals( map.get( p[i] ) )) {
                    return false;
                }
            }else{
                if(set.contains(s[i])){
                    return false;
                }
                map.put(p[i],s[i]);
                set.add(s[i]);
            }
        }
        return true;
    }

    public static void main(String[] args){
        boolean b=wordPattern("abba","dog cat cat fish");
        System.out.println(b);
    }

}
