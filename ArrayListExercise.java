import java.util.*;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

// Get user input (5 numbers)


        for (int i = 0; i <=4; i++) {
            System.out.println("Please enter number");
            numbers.add(userInput.nextInt());
        }

// Set up variables, run operations

        int sum = 0;
        long product = 1;
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (Integer value: numbers) {
            sum += value;
            product *= value;

            if (value > max) {
                max = value;
            }

            if (value < min) {
                min = value;
            }

        }

 // Print results
        System.out.printf("\nThe sum of the numbers is %s \n", sum);
        System.out.printf("The product of the numbers is %s \n", product);
        System.out.printf("The largest of the numbers is %s \n", max);
        System.out.printf("The smallest of the numbers is %s \n", min);


    }
}

