import java.util.*;
import java.util.Scanner;

public class ArrayListExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>(5);

// Get user input (5 numbers)

        int i;
        for (i = 0; i <=4; i++) {
            System.out.println("Please enter number");
            numbers.add(userInput.nextInt());
        }

        System.out.println(numbers);

// Get sum of array list

        int sum = 0;
        for (i=0; i<numbers.size(); i++){
            sum += numbers.get(i);
        }

        System.out.println(sum);

// Get product of array list

        long product = 1;
        for (i = 0; i<numbers.size(); i++){
            product *= numbers.get(i);
        }

        System.out.println(product);

// Get largest number of array list

        int max = 0;
        for (i = 0; i<numbers.size(); i++){
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }

        System.out.println(max);

// Get smallest number of array list

        int min = numbers.get(0);
        for (i = 0; i<numbers.size(); i++){
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
        }
        System.out.println(min);

    }
}

