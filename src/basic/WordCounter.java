package basic;

//Q #3) Write a Java Program to count the number of words in a string using
//HashMap.

import java.util.HashMap;
import java.util.Map;

public class WordCounter {


    public Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\s+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }

    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        Map<String, Integer> result = wc.countWords("Hello world! Hello everyone.");
        System.out.println(result);
    }
}
