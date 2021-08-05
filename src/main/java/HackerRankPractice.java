import java.util.Scanner;

public class HackerRankPractice {

    public  static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Given an integer, , perform the following conditional actions:
        //
        //If  is odd, print Weird
        //If  is even and in the inclusive range of  to , print Not Weird
        //If  is even and in the inclusive range of  to , print Weird
        //If  is even and greater than , print Not Weird
        //Complete the stub code provided in your editor to print whether or not  is weird.
        //
        //Input Format
        //
        //A single line containing a positive integer, .
        //
        //Constraints
        //
        //Output Format
        //
        //Print Weird if the number is weird; otherwise, print Not Weird.
        //
        //Sample Input 0
        //
        //3
        //Sample Output 0
        //
        //Weird
        //Sample Input 1
        //
        //24
        //Sample Output 1
        //
        //Not Weird
        //Explanation
        //
        //Sample Case 0:
        // is odd and odd numbers are weird, so we print Weird.
        //
        //Sample Case 1:
        // and  is even, so it isn't weird. Thus, we print Not Weird.
        int n = Integer.parseInt(scanner.next());

        scanner.close();
        if (n % 2 == 1) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if  (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }

        // In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.
        //
        //Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.
        //
        //Input Format
        //
        //There are three lines of input:
        //
        //The first line contains an integer.
        //The second line contains a double.
        //The third line contains a String.
        //Output Format
        //
        //There are three lines of output:
        //
        //On the first line, print String: followed by the unaltered String read from stdin.
        //On the second line, print Double: followed by the unaltered double read from stdin.
        //On the third line, print Int: followed by the unaltered integer read from stdin.
        //To make the problem easier, a portion of the code is already provided in the editor.
        //
        //Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).
        //
        //Sample Input
        //
        //42
        //3.1415
        //Welcome to HackerRank's Java tutorials!
        //Sample Output
        //
        //String: Welcome to HackerRank's Java tutorials!
        //Double: 3.1415
        //Int: 42
        int integer = scanner.nextInt();
        double number = scanner.nextDouble();

        scanner.nextLine(); // clear the keyboard buffer
        String string = scanner.nextLine();

        scanner.close();

        System.out.println("String: " + string);
        System.out.println("Double: " + number);
        System.out.println("Int: " + integer);
    }
}
