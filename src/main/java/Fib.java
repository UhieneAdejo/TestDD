package main.java;

public class Fib {

    int  first = 0;

    int second = 1;

    int next;

    int[] generatedNumbers;

    public Fib(int numbers) {
        generatedNumbers = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            if (i < 2) {
                generatedNumbers[i] = i;
            } else {
                next = first + second;
                first = second;
                second = next;
                generatedNumbers[i] = next;
            }
            System.out.println(generatedNumbers[i]); // Print the generated numbers
        }
    }

    public int[] getGeneratedNumbers() {
        return generatedNumbers;
    }
}