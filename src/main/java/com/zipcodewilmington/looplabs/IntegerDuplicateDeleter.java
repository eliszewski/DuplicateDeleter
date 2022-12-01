package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] removed = new Integer[this.array.length];
        int counter = 0;
        for (Integer i: this.array
             ) {
            if(getNumOfOcc(i) < maxNumberOfDuplications){
                removed[counter] = i;
                counter++;
            }
        }
        return Arrays.copyOf(removed, counter);
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer[] removed = new Integer[this.array.length];
        int counter = 0;
        for (Integer i: this.array
        ) {
            if(getNumOfOcc(i) != exactNumberOfDuplications){
                removed[counter] = i;
                counter++;
            }
        }
        System.out.println(counter);
        return Arrays.copyOf(removed, counter);
    }
}
