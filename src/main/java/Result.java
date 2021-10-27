import java.io.*;
import java.util.*;

public class Result {
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day);

        int p = c.get(Calendar.DAY_OF_WEEK);
        return days.get(p - 1);
    }

    // Function Description
    //Complete the factorial function in the editor below. Be sure to use recursion.
    //
    //factorial has the following paramter:
    //
    //int n: an integer
    //Returns
    //
    //int: the factorial of n
    //Note: If you fail to use recursion or fail to name your recursive function factorial or Factorial, you will get a score of 0.
    //
    //Input Format
    //
    //A single integer, n(the argument to pass to factorial).
    //
    //Constraints
    //
    // 2 < = n <= 12
    //Your submission must contain a recursive function named factorial.
    //Sample Input
    //
    //3
    //Sample Output
    //
    //6
    //Explanation
    //
    //Consider the following steps. After the recursive calls from step 1 to 3, results are accumulated from step 3 to 1.
    // factorial(3) = 3 x factorial(2) = 3 x 2 = 6
    // factorial(2) = 2 x factorial(1) = 2 x 1 = 2
    // factorial(1) = 1

    public static int factorial(int n) {
        // Write your code here
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Day 29 - Bitwise AND
    /*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */
    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int resultInRange = 0;

        for (int i = 1; i <= N; i++) {
            int result;
            for (int j = i + 1; j <= N; j++) {
                result = i & j;

                if (result < K && result > resultInRange) {
                    resultInRange = result;
                }
            }
        }

        return resultInRange;
    }






    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.factorial(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
