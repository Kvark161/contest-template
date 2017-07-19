package com.klevleev.algo;

/**
 * Created by stepank on 18.07.2017.
 */
public class StringsAlgo {

    public static int[] prefixFunction(char[] s) {
        int n = s.length;
        int[] pi = new int[n];
        for (int i = 1; i < n; ++i) {
            int j = pi[i - 1];
            while (j > 0 && s[j] != s[i]) {
                j = pi[j - 1];
            }
            if (s[j] == s[i]) {
                ++j;
            }
            pi[i] = j;
        }
        return pi;
    }

}
