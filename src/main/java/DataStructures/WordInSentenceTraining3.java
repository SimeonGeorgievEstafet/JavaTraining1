package DataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class WordInSentenceTraining3 {
    public static void main(String[] args) {

        final String TESTING = "testing";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter sentence:");
        String sentence = sc.nextLine();

        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\W", "");
        }

        if (Arrays.asList(words).contains(TESTING)) {
            System.out.println("Yes, `" + TESTING + "` is present!");
        } else {
            System.out.println("No, `" + TESTING + "` is not found!");
        }

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }
        }
        System.out.println(TESTING + "` is present " + count + " times!");
    }
}
