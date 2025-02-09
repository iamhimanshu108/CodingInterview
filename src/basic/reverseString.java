package basic;

//Q #1) Write a Java Program to reverse a string without using String inbuilt
//function.

public class reverseString {

    public static void main(String[] args) {
        String input = "Hello, World!";
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        String reversedString = new String(charArray);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}
