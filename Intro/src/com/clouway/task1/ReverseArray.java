package com.clouway.task1;

/**
 * Created by clouway on 15-8-6.
 */
public class ReverseArray {
    public int[] reverse(int[] array) {
        int length = array.length;
        int[] reverse = new int[length];
        for (int index = 0; index < length; index++) {

            reverse[length - index - 1] = array[index];
        }
        return reverse;
    }

}
