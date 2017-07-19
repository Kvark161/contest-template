package com.klevleev.dataStructures;

/**
 * Created by stepank on 19.07.2017.
 */
@SuppressWarnings("WeakerAccess")
public class FenwiсkTreeSum {

    private final int n;
    private long[] t;

    // [0..n]
    public FenwiсkTreeSum(int n) {
        this.n = n + 1;
        t = new long[this.n];
    }

    // [0..right]
    public long sum(int right) {
        long result = 0;
        for (; right >= 0; right = (right & (right+1)) - 1)
            result += t[right];
        return result;
    }

    // [0..position]
    public void add(int position, int delta)
    {
        for (; position < n; position = (position | (position+1)))
            t[position] += delta;
    }

    // [left..right]
    public long sum (int left, int right)
    {
        if (left > right) {
            return 0;
        }
        if (left == 0) {
            return sum(right);
        }
        return sum(right) - sum (left - 1);
    }

}
