package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();
        for (Integer x: sourceList) {
            result.add(x);
            if(x%2 == 0){
                while (x % 2 == 0){
                    x = x/2;
                    result.add(x);
                }
            } else {
                result.add(x*2);
            }
        }
        return result;
    }
}
