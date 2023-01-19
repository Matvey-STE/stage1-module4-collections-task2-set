package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> set = new HashSet<>(20);
        for (int i = 0; i < sourceList.size(); i++){
            int temp = sourceList.get(i);
            if (temp%2 == 0){
                while (temp%2 == 0) {
                    set.add(temp);
                    temp = temp / 2;
                }
                    set.add(temp);
            } else {
                set.add(temp);
                set.add(temp*2);
            }
        }
        return set;
    }
}
