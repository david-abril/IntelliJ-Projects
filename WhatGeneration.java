import java.util.Scanner;

public class WhatGeneration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String genA = "You are part of Generation Alpha!";
        String genZ = "You are part of Generation Z!";
        String mil = "You are a Millennial!";
        String xen = "You are a Xennial!";
        String genX = "You are part of Generation X!";
        String firstWave = "You are part of the First Wave of Baby Boomers! (1946-1954)";
        String secondWave = "You are part of the Second Wave of Baby Boomers (1955-1964)";
        String postWar = "You are part of the Post War Generation!";

        while (true) {
            System.out.println("Tell me your age and I'll tell you what generation you are part of: (Q to quit)");
            String userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("Q")) {
                break;
            } else {

                int userAge = Integer.parseInt(userInput);

                if (userAge <= 9) {
                    System.out.println(genA);
                } else if (userAge >= 10 && userAge <= 24) {
                    System.out.println(genZ);
                } else if (userAge >= 25 && userAge <= 37) {
                    System.out.println(mil);
                } else if (userAge >= 38 && userAge <= 43) {
                    System.out.println(xen);
                } else if (userAge >= 44 && userAge <= 56) {
                    System.out.println(genX);
                } else if (userAge >= 57 && userAge <= 66) {
                    System.out.println(firstWave);
                } else if (userAge >= 67 && userAge <= 75) {
                    System.out.println(secondWave);
                } else if (userAge >= 76 && userAge <= 93) {
                    System.out.println(secondWave);
                } else {
                    System.out.println("Not sure!");
                }
            }
        }
        System.out.print ("See you later!");
    }
}
