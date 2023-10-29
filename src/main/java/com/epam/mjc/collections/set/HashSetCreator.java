package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();

        for (int x : sourceList) {
            if (x % 2 == 0) {
                while (x % 2 == 0) {
                    result.add(x);
                    x /= 2;
                }
                result.add(x);
            } else {
                result.add(x);
                result.add(2 * x);
            }
        }

        return result;
    }
}

