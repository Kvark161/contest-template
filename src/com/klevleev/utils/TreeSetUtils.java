package com.klevleev.utils;

import java.util.TreeSet;
import java.util.stream.Stream;

/**
 * Created by stepank on 19.07.2017.
 */
public class TreeSetUtils {
    public static <E> TreeSet<E>[] genTreeSetArray(int size) {
        //noinspection unchecked
        return Stream.generate(TreeSet::new).limit(size).toArray(TreeSet[]::new);
    }
}
