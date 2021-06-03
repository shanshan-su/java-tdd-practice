import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

    // Consecutive Numbers
    // Create a function that determines whether elements in an array can be re-arranged to form a consecutive list of numbers where each number appears exactly once.
    //
    //Examples
    //cons([5, 1, 4, 3, 2]) ➞ true
    //// Can be re-arranged to form [1, 2, 3, 4, 5]
    //
    //cons([5, 1, 4, 3, 2, 8]) ➞ false
    //
    //cons([5, 6, 7, 8, 9, 9]) ➞ false
    //// 9 appears twice
    public static boolean consecutive(int[] ints) {
        Arrays.sort(ints);

        for (int number : ints) {
            System.out.print(number);
        }

        boolean isConsecutive = true;
        for (int i = 0; i <= ints.length - 2; i++) {
            if (ints[i + 1] - ints[i] != 1) {
                isConsecutive = false;
                break;
            }
        }
        return isConsecutive;
    }

    // Seven Boom!
    // Create a function that takes an array of numbers and return "Boom!" if the digit 7 appears in the array. Otherwise, return "there is no 7 in the array".
    //
    //Examples
    //sevenBoom([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
    //// 7 contains the number seven.
    //
    //sevenBoom([8, 6, 33, 100]) ➞ "there is no 7 in the array"
    //// None of the items contain 7 within them.
    //
    //sevenBoom([2, 55, 60, 97, 86]) ➞ "Boom!"
    //// 97 contains the number seven.
    public static String sevenBoom(int[] ints) {

        for (int number : ints) {
            // check if number contains 7 starting from the last digit of the number
            while(number > 0) {
                if (number % 10 == 7) {
                    return "Boom!";
                }
                number /= 10;
            }
        }
        return "there is no 7 in the array";
    }

    // Phone Number Word Decoder
    // Create a program that converts a phone number with letters to one with only numbers.
    //
    //Number	Letter
    //0	none
    //1	none
    //2	ABC
    //3	DEF
    //4	GHI
    //5	JKL
    //6	MNO
    //7	PQRS
    //8	TUV
    //9	WXYZ
    //Examples
    //textToNum("123-647-EYES") ➞ "123-647-3937"
    //
    //textToNum("(325)444-TEST") ➞ "(325)444-8378"
    //
    //textToNum("653-TRY-THIS") ➞ "653-879-8447"
    //
    //textToNum("435-224-7613") ➞ "435-224-7613"
    //Notes
    //All inputs will be formatted as a string representing a proper phone number in the format XXX-XXX-XXXX or (XXX)XXX-XXXX, using numbers and capital letters.
    public static String textToNum(String text) {
        Map<String, String> letterAndNum = new HashMap<String, String>(){{
            put("ABC", "2");
            put("DEF", "3");
            put("GHI", "4");
            put("JKL", "5");
            put("MNO", "6");
            put("PQRS", "7");
            put("TUV", "8");
            put("WXYZ", "9");
        }};
        String[] textArr = text.split("(?!^)");
        String phoneNumber = "";

        // go through every element in textArr
        for (int i = 0; i < textArr.length; i++) {
            boolean isText = false;
            // for each element in textArr, go through letterAndNum hashmap to see if needs to convert to number
            for (String key : letterAndNum.keySet()) {
                // if the number is text, convert the number then add to phoneNumber
                if (key.contains(textArr[i])) {
                    phoneNumber += letterAndNum.get(key);
                    isText = true;
                }
            }

            // if the number is not in the hashmap keySet, add it to phoneNumber directly
            if (isText == false) {
                phoneNumber += textArr[i];
            }
        }
        return phoneNumber;
    }

    // How Many "Prime Numbers" Are There?
    // Create a function that finds how many prime numbers there are, up to the given integer.
    //
    //Examples
    //primeNumbers(10) ➞ 4
    //// 2, 3, 5 and 7
    //
    //primeNumbers(20) ➞ 8
    //// 2, 3, 5, 7, 11, 13, 17 and 19
    //
    //primeNumbers(30) ➞ 10
    //// 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29
    public static int primeNumbers(int number) {
        if (number <= 1) {
            return 0;
        } else if (number == 2) {
            return 1;
        }

        int count = 1;

        for (int i = 3; i <= number; i++) {
            if (i % 2 != 0) {
                boolean isPrime = true;
                for (int j = 3; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }

                if (isPrime) {
                    count += 1;
                }
            }
        }
        return count;
    }

    // Persistent Little Bugger
    // Create a function that takes a number and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
    //
    //Examples
    //bugger(39) ➞ 3
    //// Because 3 * 9 = 27, 2 * 7 = 14, 1 * 4 = 4 and 4 has only one digit.
    //
    //bugger(999) ➞ 4
    //// Because 9 * 9 * 9 = 729, 7 * 2 * 9 = 126, 1 * 2 * 6 = 12, and finally 1 * 2 = 2.
    //
    //bugger(4) ➞ 0
    //// Because 4 is already a one-digit number.
    public static int bugger(int number) {
        int count = 0;
        int digit = 1;

        while (number >= 10) {
            while (number != 0) {
                digit *= number % 10;
                number /= 10;
            }
            number = digit;
            digit = 1;
            count += 1;
        }

        return count;
    }




}


