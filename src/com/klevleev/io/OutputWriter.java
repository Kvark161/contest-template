package com.klevleev.io;

import java.io.*;

/**
 * Created by stepank on 18.07.2017.
 */
@SuppressWarnings("WeakerAccess")
public class OutputWriter extends PrintWriter {
    public OutputWriter(Writer out) {
        super(out);
    }

    public OutputWriter(Writer out, boolean autoFlush) {
        super(out, autoFlush);
    }

    public OutputWriter(OutputStream out) {
        super(out);
    }

    public OutputWriter(OutputStream out, boolean autoFlush) {
        super(out, autoFlush);
    }

    public OutputWriter(String fileName) throws FileNotFoundException {
        super(fileName);
    }

    public OutputWriter(String fileName, String csn) throws FileNotFoundException, UnsupportedEncodingException {
        super(fileName, csn);
    }

    public OutputWriter(File file) throws FileNotFoundException {
        super(file);
    }

    public OutputWriter(File file, String csn) throws FileNotFoundException, UnsupportedEncodingException {
        super(file, csn);
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            print(array[i]);
            if (i + 1 < array.length) {
                print(" ");
            }
        }
    }

    public void println(int[] array) {
        //noinspection ImplicitArrayToString
        print(array);
        println();
    }
}
