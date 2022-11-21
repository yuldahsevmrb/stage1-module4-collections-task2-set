package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> result = new HashSet<>();
        for (String set1: firstSet) {
            for (String set2: secondSet) {
                if(set1.equals(set2) && !thirdSet.contains(set1)) {
                    result.add(set1);
                }
            }
        }
        for (String set3 : thirdSet) {
            if(!firstSet.contains(set3) && !secondSet.contains(set3)){
                result.add(set3);
            }
        }

        return result;
    }
}
