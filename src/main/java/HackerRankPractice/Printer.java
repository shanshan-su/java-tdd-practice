package HackerRankPractice;

public class Printer <T> {
    //
    // Method Name: printArray
    // Print each element of the generic array on a new line. Do not return anything.
    // @param A generic array
    //

    // Write your code here
    public <T> void printArray(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
