package HackerRankPractice;

import HackerRankPractice.NewPerson;

public class NewStudent extends NewPerson {
    private int[] testScores;

    public NewStudent(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public String calculate() {
        int total = 0;
        for (int i = 0; i < testScores.length; i++) {
            total += testScores[i];
        }

        double average = total / testScores.length;

        if (average >= 90) {
            return "O";
        } else if (average >= 80) {
            return "E";
        } else if (average >= 70) {
            return "A";
        } else if (average >= 55) {
            return "T";
        } else if (average >= 40) {
            return "D";
        } else {
            return "T";
        }
    }
}
