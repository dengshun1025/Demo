package com.LeetCode;

/**
 * @author  dengshun 374
 * Created by dengshun on 16-9-9.
 */
public class GuessNumberHigherOrLower {

    public static void main(String[] args){
        System.out.println(guessNumber(10));
    }

    private static int guessNumber(int n) {
        int s=1,e=n;
        int m=(s+e)/2;
        while(true){
            int i=guess(m);
            switch(i){
                case 0:System.out.println("1");return m;
                case 1: e=m;m=(s+e)/2;System.out.println("2");break;
                case -1: s=m; m=(s+e)/2;System.out.println("3");break;
                default:
            }
        }
    }

    private static int guess(int m){
        int n=7;
        if(m<n)
            return -1;
        else if(m>n)
            return 1;
        else
            return 0;
    }
}
