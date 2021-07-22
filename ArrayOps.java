import java.util.*;
import java.util.Arrays;

public class ArrayOps {

// 1) Write a program to sum all the values of a given Array in java

    public static void main(String[] args){
    int[] intArray = {4,6,9,1,4,5,9,5,7};

    System.out.println("The given array is: " + Arrays.toString(intArray));

    int sum = 0;
        for (Integer value: intArray) {
            sum += value;
        }

    System.out.println("The sum of the given array is " + sum);

// 2) What is the output?

    double[] exampleArray = {1,5,6,5,4,1};
    double maximum = exampleArray[0];
    int index = 0;
    for (int i = 1; i<exampleArray.length; i++) {
        if (exampleArray[i] > maximum) {
            maximum = exampleArray[i];
            index = i;
        }
        }
    System.out.println("\nThe array for the second problem is: " + Arrays.toString(exampleArray));
    System.out.printf("This loop returns the index of the largest number in the array, which in this case, is %s.", index);

    }

}
