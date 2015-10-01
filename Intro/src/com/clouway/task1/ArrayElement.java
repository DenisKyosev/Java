package com.clouway.task1;

/**
 * Created by clouway on 15-7-6.
 */
public class ArrayElement {
    private int[] array;
    private int length;


    public ArrayElement(int[] array) {
        this.array = array;
    }

    public int getMinElement() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}