package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {10, 20, 30};
        int[] secondArray = {5, 5, 5};
        int[] result = new int[firstArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            result[i] = firstArray[i] + secondArray[i];
        }
        System.out.println("Array Addition Result: " + Arrays.toString(result));
    }
}
