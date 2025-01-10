package algorithms;

import java.util.Arrays;

public class ArrayAlgorithms {
    public static void main(String[] args) {
        // make a good test array
            int[] betterArray = {1,2,3,4,5};
        //call the method
        // e.g. sout(findMin(myArray))
        System.out.println("MINIMUM: "+findMin(betterArray));
        System.out.println("MAXIMUM: "+findMax(betterArray));
        System.out.println("AVERAGE: "+findAverage(betterArray));
        System.out.println("SHIFT LEFT: "+ Arrays.toString(shiftLeft(betterArray)));
        System.out.println("SHIFT RIGHT: "+ Arrays.toString(shiftRight(betterArray)));
        System.out.println("REVERSED: "+ Arrays.toString(reverseArray(betterArray)));




    }

    // Finds the minimum value in an array
    public static int findMin(int[] array) {
        // TODO: Implement this method
        int running = array[0];

        for (int i = 1; i < array.length; i++) {
            int test = array[i];
                if (test < running) {
                    running = test;
                }
        }
        return running;
    }

    // Finds the maximum value in an array
    public static int findMax(int[] array) {
        int running = array[0];

        for (int i = 1; i < array.length; i++) {
            int test = array[i];
            if (test > running) {
                running = test;
            }
        }
        return running;
    }

    // Finds the average value of elements in an array
    public static double findAverage(int[] array) {
        double sum = 0;
        for( int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double avg = sum / array.length;
        return avg;
    }

    // Shifts the array to the left by one position
    public static int[] shiftLeft(int[] array) {
        int [] dupeArray = new int[array.length];
        dupeArray[array.length-1] = array[0];
        for (int i = 1; i < array.length; i++) {
            dupeArray[i-1] = array[i];
        }
        return dupeArray;
    }

    // Shifts the array to the right by one position
    public static int[] shiftRight(int[] array) {

        int [] dupeArray = new int[array.length];
        dupeArray[0] = array[array.length-1];
        for (int i = 0; i < array.length-1; i++) {
            dupeArray[i+1] = array[i];
        }
        return dupeArray;
    }

    // Reverses the elements in the array
    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = array.length-1; i >= 0; i--) {
            reversedArray[i] = array[array.length-1-i];
        }
        return reversedArray;
    }
}
