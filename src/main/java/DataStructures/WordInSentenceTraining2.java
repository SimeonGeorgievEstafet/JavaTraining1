package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class WordInSentenceTraining2 {
    public static void main(String[] args) {

        final String MARS = "Mars";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\W", "");
        }

        if (Arrays.asList(words).contains(MARS)) {
            System.out.println("Yes, `" + MARS + "` is present!");
        } else {
            System.out.println("No, `" + MARS + "` is not found!");
        }

    }
}
