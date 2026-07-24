package org.example;

import java.util.Arrays;

public class App {
    // Method to add two arrays of the same length
    public int[] addArrays(int[] array1, int[] array2) {
        // Create a result array with the same length
        int[] result = new int[array1.length];

        // Loop through and add corresponding elements
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }

        return result;
    }

    public static void main(String[] args) {
        App app = new App();

        // Define two sample arrays of equal length
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {10, 20, 30, 40, 50};

        // Add the arrays together
        int[] resultArray = app.addArrays(firstArray, secondArray);

        // Print the final result in a readable format
        System.out.println("Array 1: " + Arrays.toString(firstArray));
        System.out.println("Array 2: " + Arrays.toString(secondArray));
        System.out.println("Sum Result: " + Arrays.toString(resultArray));
    }
}
