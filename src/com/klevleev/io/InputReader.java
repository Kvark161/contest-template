package com.klevleev.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by stepank on 14.07.2017.
 */
@SuppressWarnings("WeakerAccess")
public class InputReader {

    private final BufferedReader reader;
    private StringTokenizer tokenizer;

    public InputReader(InputStream inputStream) {
        reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    private String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public String nextString() {
        return next();
    }

    public String[] readStrings(int n) {
        String[] strings = new String[n];
        for (int i = 0; i < n; ++i) {
            strings[i] = nextString();
        }
        return strings;
    }

    public int[] readIntArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = nextInt();
        }
        return arr;
    }
}
