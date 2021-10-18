package HackerRankPractice;

import java.util.ArrayList;
import java.util.List;

public class Calculator implements AdvancedArithmetic {
    public int power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        } else {
            return (int)Math.pow(n, p);
        }
    }

    @Override
    public int divisorSum(int n) {
        List<Integer> divisors = new ArrayList<>();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                sum += i;
            }
        }

        return sum;
    }
}
