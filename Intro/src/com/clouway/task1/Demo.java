package com.clouway.task1;

import gen.array.String;
import quick.array.sort.QuickSort;
import java.util.Arrays;

class Demo {

    public static void main(java.lang.String[] args) {


        //Random generate string
        String generate = new String();
        System.out.println("Random Generate String begin:");
        System.out.println(generate.generateRandomString());

        // ProcessingArray begin
        ArrayElement array = new ArrayElement(new int[]{50, 20, 30});
        int min = array.getMinElement();
        System.out.println("\nProcessing ArrayElement begin:");
        System.out.println("Min element is: " + min);

        // ArrayReverse begin
        ReverseArray arr = new ReverseArray();
        int [] reversed = arr.reverse(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("\nArrayElement Reverse begin:");
        System.out.println(Arrays.toString(reversed));

        //QuickSort begin

        QuickSort sorter = new QuickSort();
        int [] input = {2 ,1 ,5 ,8 ,4 ,9 ,3 ,6 ,7 ,0};
        sorter.sort(input);
        System.out.println("\nQuickSort begin:");
        for (int i:input){
            System.out.print(i);
            System.out.println(" ");

        }
    }
}