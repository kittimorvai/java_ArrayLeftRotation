package mypackage;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        rotateLeft(array, 1);
    }


    public static void rotateLeft(int[] array, int rotationStep) {
        int size = array.length;
        int[] rotatedArray = new int[size];

        if (rotationStep > size) {
            System.out.println("Invalid value.");
        }

        for (int i = 0; i < size; i++) {
            if (i - rotationStep >= 0) {
                rotatedArray[i - rotationStep] = array[i];
            } else {
                rotatedArray[size + (i - rotationStep)] = array[i];
            }
        }
        System.out.println(Arrays.toString(rotatedArray));
    }
}
