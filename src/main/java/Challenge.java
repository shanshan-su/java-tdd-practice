public class Challenge {
//    How Many Solutions Does This Quadratic Have?
//A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct solutions for real values of x. Given a, b and c, you should return the number of solutions to the equation.

//            Examples
//    solutions(1, 0, -1) ➞ 2
//// x² - 1 = 0 has two solutions (x = 1 and x = -1).
//
//    solutions(1, 0, 0) ➞ 1
//// x² = 0 has one solution (x = 0).
//
//    solutions(1, 0, 1) ➞ 0
//// x² + 1 = 0 has no real solutions.
//    Notes
//    You do not have to calculate the solutions, just return how many there are.
//    a will always be non-zero.
    public static int solutions(int a, int b, int c) {
        int result = b * b - 4 * a * c;
        if (result == 0) {
            return 1;
        } else if (result < 0) {
            return 0;
        } else {
            return 2;
        }
    }

    // War of Numbers
    // There's a great war between the even and odd numbers. Many numbers already lost their life in this war and it's your task to end this. You have to determine which group sums larger: the even, or the odd. The larger group wins.
    //
    //Create a function that takes an array of integers, sums the even and odd numbers separately, then returns the difference between sum of even and odd numbers.
    //
    //Examples
    //warOfNumbers([2, 8, 7, 5]) ➞ 2
    //// 2 + 8 = 10
    //// 7 + 5 = 12
    //// 12 is larger than 10
    //// So we return 12 - 10 = 2
    //
    //warOfNumbers([12, 90, 75]) ➞ 27
    //
    //warOfNumbers([5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243]) ➞ 168
    public static int warOfNumbers(int[] ints) {
        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int number : ints) {
            if (number % 2 == 0) {
                sumOfEven += number;
            } else {
                sumOfOdd += number;
            }
        }

        if (sumOfEven >= sumOfOdd) {
            return sumOfEven - sumOfOdd;
        } else {
            return sumOfOdd - sumOfEven;
        }
    }
}


