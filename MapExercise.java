import java.util.*;
import java.util.Scanner;

public class MapExercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        HashMap<String, String> car = new HashMap<>();
        car.put("Honda", "Civic");
        car.put("Toyota", "Camry");
        car.put("Ford", "Explorer");
        car.put("Nissan", "Altima");

        while (true) {
            System.out.println("Welcome to our dealership. What model are you looking for? (Press Q to quit)");
            String model = userInput.nextLine();
            if (model.equalsIgnoreCase("Q")) {
                break;
            } else {

                if (car.containsValue(model)) {

                    for (Map.Entry<String, String> entry : car.entrySet()) {
                        if (Objects.equals(entry.getValue(), model)) {
                            System.out.printf("We have it! It's in the %s section.", entry.getKey());
                        }
                    }
                } else {
                    System.out.println("Sorry, we don't carry that one!");
                }
            }
        }

        System.out.println("Thanks for stopping by!");
    }
}
