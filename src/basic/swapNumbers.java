package basic;

//Q #2) Write a Java Program to swap two numbers without using the third
//variable.

public class swapNumbers {
    public static void main(String[] args) {
        int a=5;
        int b= 10;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b; // a becomes 15 (5 + 10)
        b = a - b; // b becomes 5 (15 - 10, original value of a)
        a = a - b; // a becomes 10 (15 - 5, original value of b)

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
