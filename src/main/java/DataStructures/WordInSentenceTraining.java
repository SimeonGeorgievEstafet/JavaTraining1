package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class WordInSentenceTraining {
    public static void main(String[] args) {

        final String WORLD = "World";
        final String MARS = "Mars";
        final String TESTING = "Testing";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\W", "");
        }

        if (Arrays.asList(words).contains(WORLD)) {
            System.out.println("Yes, `" + WORLD + "` is present!");
        } else {
            System.out.println("No, `" + WORLD + "` is not found!");
        }

    }
}
