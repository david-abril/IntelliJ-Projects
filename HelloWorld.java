import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = userInput.nextLine();
        System.out.println("Enter adverb");
        String adverb = userInput.nextLine();
        System.out.println("Enter adjective");
        String adjective = userInput.nextLine();
        System.out.println("Enter noun");
        String nounOne = userInput.nextLine();
        System.out.println("Enter noun");
        String nounTwo = userInput.nextLine();
        System.out.println("Enter number");
        String number = userInput.nextLine();
        System.out.println("Enter full name");
        String name = userInput.nextLine();

        System.out.printf("\n Dear %s\n", firstName);
        System.out.printf("\n You are %s %s and I want to be your %s! I want to go to the %s with you in %s days\n", adverb,adjective, nounOne, nounTwo, number);
        System.out.printf("\n Sincerely, %s\n", name);

    }
}


