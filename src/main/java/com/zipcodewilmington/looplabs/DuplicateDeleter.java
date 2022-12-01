package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/25/18.
 */
public abstract class DuplicateDeleter<T> implements DuplicateDeleterInterface<T> {
    protected T[] array;

    public DuplicateDeleter(T[] intArray) {
        this.array = intArray;
    }

    abstract public T[] removeDuplicates(int maxNumberOfDuplications);
    abstract public T[] removeDuplicatesExactly(int exactNumberOfDuplications);

    //implement a getNumOfOcc
    public int getNumOfOcc(T valueToCheck){
        int counter = 0;
        for (T t: this.array
             ) {
            if(valueToCheck.equals(t))counter++;
        }
        return counter;
    }
}
