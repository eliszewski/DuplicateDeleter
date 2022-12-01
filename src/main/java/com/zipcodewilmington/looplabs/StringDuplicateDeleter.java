package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] removed = new String[this.array.length];
        int counter = 0;
        for (String i: this.array
        ) {
            if(getNumOfOcc(i) < maxNumberOfDuplications){
                removed[counter] = i;
                counter++;
            }
        }
        return Arrays.copyOf(removed, counter);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String[] removed = new String[this.array.length];
        int counter = 0;
        for (String i: this.array
        ) {
            if(getNumOfOcc(i) != exactNumberOfDuplications){
                removed[counter] = i;
                counter++;
            }
        }
        return Arrays.copyOf(removed, counter);
    }
}
