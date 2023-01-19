package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        Set<Integer> set = new TreeSet<>();
        int temp;
        for (int i = 0; i < sourceList.size(); i++){
            temp = (int) Math.pow((sourceList.get(i)), 2);
            if (temp >= lowerBound && temp<=upperBound){
                set.add(temp);
            }
        }
        return set;
    }
}
