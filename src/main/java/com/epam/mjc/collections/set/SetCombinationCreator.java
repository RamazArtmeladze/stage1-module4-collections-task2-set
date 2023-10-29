package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>(firstSet);

        // Remove elements that belong to both firstSet and secondSet
        resultSet.retainAll(secondSet);

        // Remove elements that belong to thirdSet
        resultSet.removeAll(thirdSet);

        // Add elements that belong only to thirdSet
        Set<String> thirdSetCopy = new HashSet<>(thirdSet);
        thirdSetCopy.removeAll(firstSet);
        thirdSetCopy.removeAll(secondSet);
        resultSet.addAll(thirdSetCopy);

        return resultSet;
    }
}

