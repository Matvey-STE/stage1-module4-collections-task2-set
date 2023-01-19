package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> set = new HashSet<>(firstSet);
        Set<String> set2 = new HashSet<>(thirdSet);
        set.retainAll(secondSet);
        set2.removeAll(firstSet);
        set2.removeAll(secondSet);
        set.addAll(set2);
        return set;
    }
}
/**/