package com.klevleev.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by stepank on 18.07.2017.
 */
public class ListUtils {
    public static <E> List<E>[] genArrayList(int size) {
        //noinspection unchecked
        return Stream.generate(ArrayList::new).limit(size).toArray(List[]::new);
    }
}
