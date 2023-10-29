package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squareSet = new TreeSet<>();

        for (int num : sourceList) {
            squareSet.add(num * num);
        }

        return squareSet.subSet(lowerBound, true, upperBound, true);
    }
}

