package HackerRankPractice;

import java.util.Arrays;

public class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    public Difference(int[] elements) {
        this.elements = elements;
    }

    public int computeDifference() {
        Arrays.sort(elements);

        maximumDifference = elements[elements.length - 1] - elements[0];
        return maximumDifference;
    }
}
