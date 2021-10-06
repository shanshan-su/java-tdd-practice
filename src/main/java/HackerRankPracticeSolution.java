import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class HackerRankPracticeSolution {
    public  static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);

        // Given an integer n, perform the following conditional actions:
        //
        //If n is odd, print Weird
        //If n is even and in the inclusive range of  to , print Not Weird
        //If n is even and in the inclusive range of  to , print Weird
        //If n is even and greater than , print Not Weird
        //Complete the stub code provided in your editor to print whether or not  is weird.
        //
        //Input Format
        //
        //A single line containing a positive integer n.
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

        // Input Format
        //
        //Every line of input will contain a String followed by an integer.
        //Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .
        //
        //Output Format
        //
        //In each line of output there should be two columns:
        //The first column contains the String and is left justified using exactly  characters.
        //The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
        //
        //Sample Input
        //
        //java 100
        //cpp 65
        //python 50
        //Sample Output
        //
        //================================
        //java           100
        //cpp            065
        //python         050
        //================================
        //Explanation
        //
        //Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
        System.out.println("================================");
        while (scanner.hasNext()) {
            string = scanner.next();
            number = scanner.nextInt();
            System.out.printf("%-15s%03d%n", string, number);
        }
        scanner.close();
        System.out.println("================================");

        // Task
        //Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.
        //
        //Input Format
        //
        //A single integer, .
        //
        //Constraints
        //
        //Output Format
        //
        //Print  lines of output; each line  (where ) contains the  of  in the form:
        //N x i = result.
        //
        //Sample Input
        //
        //2
        //Sample Output
        //
        //2 x 1 = 2
        //2 x 2 = 4
        //2 x 3 = 6
        //2 x 4 = 8
        //2 x 5 = 10
        //2 x 6 = 12
        //2 x 7 = 14
        //2 x 8 = 16
        //2 x 9 = 18
        //2 x 10 = 20

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.printf("%d x %d = %d%n", N, i, result);
        }
        bufferedReader.close();

        // We use the integers , , and  to create the following series:
        //
        //You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.
        //
        //Input Format
        //
        //The first line contains an integer, , denoting the number of queries.
        //Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.
        //
        //Constraints
        //
        //Output Format
        //
        //For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
        //
        //Sample Input
        //
        //2
        //0 2 10
        //5 3 5
        //Sample Output
        //
        //2 6 14 30 62 126 254 510 1022 2046
        //8 14 26 50 98
        //Explanation
        //
        //We have two queries:
        //
        //We use , , and  to produce some series :
        //
        //... and so on.
        //
        //Once we hit , we print the first ten terms as a single line of space-separated integers.
        //
        //We use , , and  to produce some series :
        //
        //We then print each element of our series as a single line of space-separated values.
        int q = scanner.nextInt();

        for (int i = 1; i <= q; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                a += b * Math.pow(2, j);
                System.out.printf("%d ", a);
            }
            System.out.println();
        }

        // Input Format
        //
        //The first line contains an integer, , denoting the number of test cases.
        //Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.
        //
        //Output Format
        //
        //For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:
        //
        //n can be fitted in:
        //* dataType
        //If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).
        //
        //If the number cannot be stored in one of the four aforementioned primitives, print the line:
        //
        //n can't be fitted anywhere.
        //Sample Input
        //
        //5
        //-150
        //150000
        //1500000000
        //213333333333333333333333333333333333
        //-100000000000000
        //Sample Output
        //
        //-150 can be fitted in:
        //* short
        //* int
        //* long
        //150000 can be fitted in:
        //* int
        //* long
        //1500000000 can be fitted in:
        //* int
        //* long
        //213333333333333333333333333333333333 can't be fitted anywhere.
        //-100000000000000 can be fitted in:
        //* long
        //Explanation
        //
        // can be stored in a short, an int, or a long.
        //
        // is very large and is outside of the allowable range of values for the primitive data types discussed in this problem.

        int T = scanner.nextInt();

        for (int i = 1; i <= T; i++) {
            String num = scanner.next();
            List<String> results = new ArrayList();
            try {
                long numberLong = Long.parseLong(num);
                System.out.printf("%d can be fitted in:%n", numberLong);
                results.add("long");

                if (numberLong >= -2147483648 && numberLong <= 2147483647) {
                    results.add(0, "int");
                }
                if (numberLong >= -32768 && numberLong <= 32767) {
                    results.add(0, "short");
                }
                if (numberLong >= -128 && numberLong <= 127) {
                    results.add(0, "byte");
                }
            } catch(NumberFormatException e) {
                System.out.printf("%s can't be fitted anywhere.%n", num);
            }

            for (String result : results) {
                System.out.printf("* %s%n", result);
            }
        }

        // "In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)
        //
        //The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.
        //
        //Hint: Java's Scanner.hasNext() method is helpful for this problem.
        //
        //Input Format
        //
        //Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.
        //
        //Output Format
        //
        //For each line, print the line number, followed by a single space, and then the line content received as input.
        //
        //Sample Input
        //
        //Hello world
        //I am a file
        //Read me until end-of-file.
        //Sample Output
        //
        //1 Hello world
        //2 I am a file
        //3 Read me until end-of-file.

        int i = 0;
        while(scanner.hasNext()) {
            string = scanner.nextLine();
            i++;
            System.out.printf("%d %s%n", i, string);
        }

        // Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
        //
        //It's time to test your knowledge of Static initialization blocks. You can read about it here.
        //
        //You are given a class Solution with a main method. Complete the given code so that it outputs the area of a parallelogram with breadth  and height . You should read the variables from the standard input.
        //
        //If  or  , the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
        //
        //Input Format
        //
        //There are two lines of input. The first line contains : the breadth of the parallelogram. The next line contains : the height of the parallelogram.
        //
        //Constraints
        //
        //Output Format
        //
        //If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
        //
        //Sample input 1
        //
        //1
        //3
        //Sample output 1
        //
        //3
        //Sample input 2
        //
        //-1
        //2
        //Sample output 2
        //
        //java.lang.Exception: Breadth and height must be positive

        int B = scanner.nextInt();
        int H = scanner.nextInt();

        if (B > 0 && H > 0) {
            System.out.println(B * H);
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

        // You are given an integer , you have to convert it into a string.
        //
        //Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
        //
        // can range between  to  inclusive.
        //
        //Sample Input 0
        //
        //100
        //Sample Output 0
        //
        //Good job

        n = scanner.nextInt();
        try {
            String s = String.valueOf(n);
            System.out.println("Good job");
        } catch (Exception e) {
            System.out.println("Wrong answer");
        }

        // Function Description
        //
        //Complete the findDay function in the editor below.
        //
        //findDay has the following parameters:
        //
        //int: month
        //int: day
        //int: year
        //Returns
        //
        //string: the day of the week in capital letters
        //Input Format
        //
        //A single line of input containing the space separated month, day and year, respectively, in    format.
        //
        //Constraints
        //
        //Sample Input
        //
        //08 05 2015
        //Sample Output
        //
        //WEDNESDAY
        //Explanation
        //
        //The day on August th  was WEDNESDAY.

        int month = scanner.nextInt();

        int day = scanner.nextInt();

        int year = scanner.nextInt();

        System.out.println(Result.findDay(month, day, year));


        // Given a double-precision number, , denoting an amount of money, use the NumberFormat class' getCurrencyInstance method to convert  into the US, Indian, Chinese, and French currency formats. Then print the formatted values as follows:
        //
        //US: formattedPayment
        //India: formattedPayment
        //China: formattedPayment
        //France: formattedPayment
        //where  is  formatted according to the appropriate Locale's currency.
        //
        //Note: India does not have a built-in Locale, so you must construct one where the language is en (i.e., English).
        //
        //Input Format
        //
        //A single double-precision number denoting .
        //
        //Constraints
        //
        //Output Format
        //
        //On the first line, print US: u where  is  formatted for US currency.
        //On the second line, print India: i where  is  formatted for Indian currency.
        //On the third line, print China: c where  is  formatted for Chinese currency.
        //On the fourth line, print France: f, where  is  formatted for French currency.
        //
        //Sample Input
        //
        //12324.134
        //Sample Output
        //
        //US: $12,324.13
        //India: Rs.12,324.13
        //China: ￥12,324.13
        //France: 12 324,13 €
        //Explanation
        //
        //Each line contains the value of  formatted according to the four countries' respective currencies.

        double payment = scanner.nextDouble();

        NumberFormat numberFormat;
        numberFormat = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        System.out.printf("US: %s%n", numberFormat.format(payment));

        numberFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        System.out.printf("India: %s%n", numberFormat.format(payment));

        numberFormat = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        System.out.printf("China: %s%n", numberFormat.format(payment));

        numberFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.printf("France: %s%n", numberFormat.format(payment));

        // Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.
        //
        //The Player class is provided for you in your editor. It has  fields: a  String and a  integer.
        //
        //Given an array of  Player objects, write a comparator that sorts them in order of decreasing score; if  or more players have the same score, sort those players alphabetically by name. To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
        //
        //Input Format
        //
        //Input from stdin is handled by the locked stub code in the Solution class.
        //
        //The first line contains an integer, , denoting the number of players.
        //Each of the  subsequent lines contains a player's  and , respectively.
        //
        //Constraints
        //
        // players can have the same name.
        //Player names consist of lowercase English letters.
        //Output Format
        //
        //You are not responsible for printing any output to stdout. The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.
        //
        //Sample Input
        //
        //5
        //amy 100
        //david 100
        //heraldo 50
        //aakansha 75
        //aleksa 150
        //Sample Output
        //
        //aleksa 150
        //amy 100
        //david 100
        //aakansha 75
        //heraldo 50
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

        // You are given a list of student information: ID, FirstName, and CGPA. Your task is to rearrange them according to their CGPA in decreasing order. If two student have the same CGPA, then arrange them according to their first name in alphabetical order. If those two students also have the same first name, then order them according to their ID. No two students have the same ID.
        //
        //Hint: You can use comparators to sort a list of objects. See the oracle docs to learn about comparators.
        //
        //Input Format
        //
        //The first line of input contains an integer , representing the total number of students. The next  lines contains a list of student information in the following structure:
        //
        //ID Name CGPA
        //Constraints
        //
        //
        //
        //
        //
        //
        //The name contains only lowercase English letters. The  contains only integer numbers without leading zeros. The CGPA will contain, at most, 2 digits after the decimal point.
        //
        //Output Format
        //
        //After rearranging the students according to the above rules, print the first name of each student on a separate line.
        //
        //Sample Input
        //
        //5
        //33 Rumpa 3.68
        //85 Ashis 3.85
        //56 Samiha 3.75
        //19 Samara 3.75
        //22 Fahim 3.76
        //Sample Output
        //
        //Ashis
        //Fahim
        //Samara
        //Samiha
        //Rumpa
        int testCases = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = scanner.nextInt();
            String fname = scanner.next();
            double cgpa = scanner.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        final Comparator<Student> comparator = new Comparator<Student>() {
            public int compare(Student student1, Student student2) {
                if (student1.getCgpa() > student2.getCgpa()) {
                    return -1;
                } else if  (student1.getCgpa() < student2.getCgpa()) {
                    return 1;
                } else {
                    if (student1.getFname().equals(student2.getFname())) {
                        return student1.getId() - student2.getId();
                    } else {
                        return student1.getFname().compareTo(student2.getFname());
                    }
                }
            }
        };

        // sort the list
        Collections.sort(studentList, comparator);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }

        // In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).
        //
        //Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:
        //
        //Deque deque = new LinkedList<>();
        //or
        //Deque deque = new ArrayDeque<>();
        //You can find more details about Deque here.
        //
        //In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .
        //
        //Note: Time limit is 3 second for this problem.
        //
        //Input Format
        //
        //The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.
        //
        //Constraints
        //
        //The numbers in the array will range between .
        //
        //Output Format
        //
        //Print the maximum number of unique integers among all possible contiguous subarrays of size .
        //
        //Sample Input
        //
        //6 3
        //5 3 5 2 3 2
        //Sample Output
        //
        //3
        //Explanation
        //
        //In the sample testcase, there are 4 subarrays of contiguous numbers.
        //
        // - Has  unique numbers.
        //
        // - Has  unique numbers.
        //
        // - Has  unique numbers.
        //
        // - Has  unique numbers.
        //
        //In these subarrays, there are  unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is .
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        int max = 0;

        n = scanner.nextInt();
        int m = scanner.nextInt();

        for (i = 0; i < n; i++) {
            int input = scanner.nextInt();

            deque.add(input);
            uniqueNumbers.add(input);

            if (deque.size() == m) {
                if (uniqueNumbers.size() > max) {
                    max = uniqueNumbers.size();
                }

                int first = deque.remove();
                if  (!deque.contains(first)) {
                    uniqueNumbers.remove(first);
                }
            }
        }

        System.out.println(max);

        // Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.
        //
        //Given  BitSets,  and , of size  where all bits in both BitSets are initialized to , perform a series of  operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
        //
        //Input Format
        //
        //The first line contains  space-separated integers,  (the length of both BitSets  and ) and  (the number of operations to perform), respectively.
        //The  subsequent lines each contain an operation in one of the following forms:
        //
        //AND
        //OR
        //XOR
        //FLIP
        //SET
        //In the list above,  is the integer  or , where  denotes  and  denotes .
        // is an integer denoting a bit's index in the BitSet corresponding to .
        //
        //For the binary operations , , and , operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:
        //
        //AND 2 1
        // is the left operand, and  is the right operand. This operation should assign the result of  to .
        //
        //Constraints
        //
        //Output Format
        //
        //After each operation, print the respective number of set bits in BitSet  and BitSet  as  space-separated integers on a new line.
        //
        //Sample Input
        //
        //5 4
        //AND 1 2
        //SET 1 4
        //FLIP 2 2
        //OR 2 1
        //Sample Output
        //
        //0 0
        //1 0
        //1 1
        //1 2

        n = scanner.nextInt();
        m = scanner.nextInt();

        BitSet bitSet1 = new BitSet(n);
        BitSet bitSet2 = new BitSet(n);

        BitSet[] bitSets = {new BitSet(n), bitSet1, bitSet2};

        for (i = 0; i < m; i++) {
            String operator = scanner.next();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (operator.equals("AND")) {
                bitSets[x].and(bitSets[y]);
            } else if (operator.equals("OR")) {
                bitSets[x].or(bitSets[y]);
            } else if (operator.equals("XOR")) {
                bitSets[x].xor(bitSets[y]);
            } else if (operator.equals("FLIP")) {
                bitSets[x].flip(y);
            } else if (operator.equals("SET")) {
                bitSets[x].set(y);
            }

            System.out.printf("%d %d%n", bitSets[1].cardinality(), bitSets[2].cardinality());
        }

        // Given two strings of lowercase English letters,  and , perform the following operations:
        //
        //Sum the lengths of  and .
        //Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
        //Capitalize the first letter in  and  and print them on a single line, separated by a space.
        //Input Format
        //
        //The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.
        //
        //Output Format
        //
        //There are three lines of output:
        //For the first line, sum the lengths of  and .
        //For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
        //For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.
        //
        //Sample Input 0
        //
        //hello
        //java
        //Sample Output 0
        //
        //9
        //No
        //Hello Java
        //Explanation 0
        //
        //String  is "hello" and  is "java".
        //
        // has a length of , and  has a length of ; the sum of their lengths is .
        //When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.
        //
        //When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".

        String input1 = scanner.next();
        String input2 = scanner.next();
        String[] inputs = {input1, input2};
        Arrays.sort(inputs);

        int sum = input1.length() + input2.length();
        System.out.println(sum);
        if (inputs[0].equals(input1)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        System.out.println(input1.substring(0, 1).toUpperCase() + input1.substring(1).toLowerCase() + " " + input2.substring(0, 1).toUpperCase() + input2.substring(1).toLowerCase());

        // Given a string, , and two indices,  and , print a substring consisting of all characters in the inclusive range from  to . You'll find the String class' substring method helpful in completing this challenge.
        //
        //Input Format
        //
        //The first line contains a single string denoting .
        //The second line contains two space-separated integers denoting the respective values of  and .
        //
        //Constraints
        //
        //String  consists of English alphabetic letters (i.e., ) only.
        //Output Format
        //
        //Print the substring in the inclusive range from  to .
        //
        //Sample Input
        //
        //Helloworld
        //3 7
        //Sample Output
        //
        //lowo

        string = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(string.substring(start, end));


        // Complete the getSmallestAndLargest function in the editor below.
        //
        //getSmallestAndLargest has the following parameters:
        //
        //string s: a string
        //int k: the length of the substrings to find
        //Returns
        //
        //string: the string ' + "\n" + ' where and are the two substrings
        //Input Format
        //
        //The first line contains a string denoting .
        //The second line contains an integer denoting .
        //
        //Constraints
        //
        // consists of English alphabetic letters only (i.e., [a-zA-Z]).
        //Sample Input 0
        //
        //welcometojava
        //3
        //Sample Output 0
        //
        //ava
        //wel
        //Explanation 0
        //
        //String  has the following lexicographically-ordered substrings of length :
        //
        //We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
        //
        //The stub code in the editor then prints ava as our first line of output and wel as our second line of output.

        string = scanner.next();
        int len = scanner.nextInt();

        List<String> stringList = new ArrayList<>();

        for (i = 0; i < string.length() - len + 1; i++) {
            String element = string.substring(i, len + i);
            stringList.add(element);
        }

        Collections.sort(stringList);

        System.out.println(stringList.get(0));
        System.out.println(stringList.get(stringList.size() - 1));


        // A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
        //
        //Given a string , print Yes if it is a palindrome, print No otherwise.
        //
        //Constraints
        //
        // will consist at most 50 lower case english letters.
        //Sample Input
        //
        //madam
        //Sample Output
        //
        //Yes

        string = scanner.next();

        boolean isPalindrome = string.equals(new StringBuilder(string).reverse().toString());
        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.
        //
        //Function Description
        //
        //Complete the isAnagram function in the editor.
        //
        //isAnagram has the following parameters:
        //
        //string a: the first string
        //string b: the second string
        //Returns
        //
        //boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
        //Input Format
        //
        //The first line contains a string .
        //The second line contains a string .
        //
        //Constraints
        //
        //Strings  and  consist of English alphabetic characters.
        //The comparison should NOT be case sensitive.
        //Sample Input 0
        //
        //anagram
        //margana
        //Sample Output 0
        //
        //Anagrams
        //Explanation 0
        //
        //Character	Frequency: anagram	Frequency: margana
        //A or a	3	3
        //G or g	1	1
        //N or n	1	1
        //M or m	1	1
        //R or r	1	1
        //The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
        //
        //Sample Input 1
        //
        //anagramm
        //marganaa
        //Sample Output 1
        //
        //Not Anagrams
        //Explanation 1
        //
        //Character	Frequency: anagramm	Frequency: marganaa
        //A or a	3	4
        //G or g	1	1
        //N or n	1	1
        //M or m	2	1
        //R or r	1	1
        //The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".
        //
        //Sample Input 2
        //
        //Hello
        //hello
        //Sample Output 2
        //
        //Anagrams
        //Explanation 2
        //
        //Character	Frequency: Hello	Frequency: hello
        //E or e	1	1
        //H or h	1	1
        //L or l	2	2
        //O or o	1	1
        //The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

        List<String> list1 = Arrays.asList(scanner.next().split(""));
        List<String> list2 = Arrays.asList(scanner.next().split(""));

        Set<String> letterSet = new HashSet<>();
        letterSet.addAll(list1);
        letterSet.addAll(list2);

        boolean isAnagrams = true;

        for (String letter : letterSet) {
            int count1 = 0;
            int count2 = 0;
            // count how many string there are in list1
            for (String letter1 : list1) {
                if (letter1.equalsIgnoreCase(letter)) {
                    count1 += 1;
                }
            }

            // count how many string there are in list2
            for (String character : list2) {
                if (character.equalsIgnoreCase(letter)) {
                    count2 += 1;
                }
            }

            if  (count1 != count2) {
                isAnagrams = false;
                System.out.println("Not Anagrams");
                break;
            }
        }

        if (isAnagrams) {
            System.out.println("Anagrams");
        }

        // Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.
        //
        //Note: You may find the String.split method helpful in completing this challenge.
        //
        //Input Format
        //
        //A single string, s.
        //
        //Constraints
        //
        //s is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
        //Output Format
        //
        //On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique). Next, print each of the n tokens on a new line in the same order as they appear in input string s.
        //
        //Sample Input
        //
        //He is a very very good boy, isn't he?
        //Sample Output
        //
        //10
        //He
        //is
        //a
        //very
        //very
        //good
        //boy
        //isn
        //t
        //he
        //Explanation
        //
        //We consider a token to be a contiguous segment of alphabetic characters. There are a total of  such tokens in string , and each token is printed in the same order in which it appears in string .

        String sentence = scanner.nextLine().trim();

        if (sentence.length() == 0) {
            System.out.println(0);
        } else if (sentence.length() <= 400000){
            String[] letters = sentence.split("[\\s!,?._'@]+");

            System.out.println(letters.length);
            for (String letter : letters) {
                System.out.println(letter);
            }
        }

        // MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function with a 128-bit hash value. Here are some common uses for MD5:
        //
        //To store a one-way hash of a password.
        //To provide some assurance that a transferred file has arrived intact.
        //MD5 is one in a series of message digest algorithms designed by Professor Ronald Rivest of MIT (Rivest, 1994); however, the security of MD5 has been severely compromised, most infamously by the Flame malware in 2012. The CMU Software Engineering Institute essentially considers MD5 to be "cryptographically broken and unsuitable for further use".
        //
        //Given an alphanumeric string, s, denoting a password, compute and print its MD5 encryption value.
        //
        //Input Format
        //
        //A single alphanumeric string denoting s.
        //
        //Constraints
        //
        // 6 <= |s| <= 20
        //String s consists of English alphabetic letters (i.e., [a-zA-Z] and/or decimal digits (i.e., 0 through 9) only.
        //Output Format
        //
        //Print the MD5 encryption value of s on a new line.
        //
        //Sample Input 0
        //
        //HelloWorld
        //Sample Output 0
        //
        //68e109f0f40ca72a15e05cc22786f8e6
        //Sample Input 1
        //
        //Javarmi123
        //Sample Output 1
        //
        //2da2d1e0ce7b4951a858ed2d547ef485

        string = scanner.nextLine();

        /* Encode the String using MD5 */
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(string.getBytes());
        byte[] digest = md.digest();

        /* Print the encoded value in hexadecimal */
        for (byte b : digest) {
            System.out.format("%02x", b);
        }


        // You are given a class Solution and its main method in the editor.
        //Your task is to create the class Add and the required methods so that the code prints the sum of the numbers passed to the function add.
        //
        //Note: Your add method in the Add class must print the sum as given in the Sample Output
        //
        //Input Format
        //
        //There are six lines of input, each containing an integer.
        //
        //Output Format
        //
        //There will be only four lines of output. Each line contains the sum of the integers passed as the parameters to add in the main method.
        //
        //Sample Input
        //
        //1
        //2
        //3
        //4
        //5
        //6
        //Sample Output
        //
        //1+2=3
        //1+2+3=6
        //1+2+3+4+5=15
        //1+2+3+4+5+6=21

        Add solution = new Add();

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int number4 = scanner.nextInt();
        int number5 = scanner.nextInt();
        int number6 = scanner.nextInt();

        System.out.println(solution.add(number1, number2));
        System.out.println(solution.add(number1, number2, number3));
        System.out.println(solution.add(number1, number2, number3, number4, number5));
        System.out.println(solution.add(number1, number2, number3, number4, number5, number6));

        // Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.
        //
        //In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
        //
        //Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.
        //
        //Input Format
        //
        //The first line of input contains an integer N, denoting the number of test cases. The next N lines contain a string of any printable characters representing the pattern of a regex.
        //
        //Output Format
        //
        //For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.
        //
        //Sample Input
        //
        //3
        //([A-Z])(.+)
        //[AZ[a-z](a-z)
        //batcatpat(nat
        //Sample Output
        //
        //Valid
        //Invalid
        //Invalid

        number = scanner.nextInt();

        // gets rid of the pesky newline.
        scanner.nextLine();

        for (i = 1; i <= number; i++) {
            String pattern = scanner.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(PatternSyntaxException exception) {
                System.out.println("Invalid");
            }
        }

        // Write a class called MyRegex which will contain a string pattern. You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address. Use the following definition of an IP address:
        //
        //IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255. Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
        //Some valid IP address:
        //
        //000.12.12.034
        //121.234.12.12
        //23.45.12.56
        //Some invalid IP address:
        //
        //000.12.234.23.23
        //666.666.23.23
        //.213.123.23.32
        //23.45.22.32.
        //I.Am.not.an.ip
        //In this problem you will be provided strings containing any combination of ASCII characters. You have to write a regular expression to find the valid IPs.
        //
        //Just write the MyRegex class which contains a String pattern. The string should contain the correct regular expression.
        //
        //(MyRegex class MUST NOT be public)
        //
        //Sample Input
        //
        //000.12.12.034
        //121.234.12.12
        //23.45.12.56
        //00.12.123.123123.123
        //122.23
        //Hello.IP
        //Sample Output
        //
        //true
        //true
        //true
        //false
        //false
        //false

        String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        while (scanner.hasNextLine()) {
            boolean isIP = true;
            String ip = scanner.nextLine();
            String[] ips = string.split("\\.");

            if (ips.length != 4) {
                isIP = false;
            }

            for (String part : ips) {
                if (part.length() > 3) {
                    isIP = false;
                }

                if (!part.matches(zeroTo255)) {
                    isIP = false;
                }
            }

            if (isIP) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

        // In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word. For example, the words love and to are repeated in the sentence I love Love to To tO code. Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?
        //
        //To solve this challenge, complete the following three lines:
        //
        //Write a RegEx that will match any repeated word.
        //Complete the second compile argument so that the compiled RegEx is case-insensitive.
        //Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first instance the word found in the sentence. It must be the exact first occurrence of the word, as the expected output is case-sensitive.
        //Note: This challenge uses a custom checker; you will fail the challenge if you modify anything other than the three locations that the comments direct you to complete. To restore the editor's original stub code, create a new buffer by clicking on the branch icon in the top left of the editor.
        //
        //Input Format
        //
        //The following input is handled for you the given stub code:
        //
        //The first line contains an integer, n, denoting the number of sentences.
        //Each of the n subsequent lines contains a single sentence consisting of English alphabetic letters and whitespace characters.
        //
        //Constraints
        //
        //Each sentence consists of at most 10^4 English alphabetic letters and whitespaces.
        //1 <= n <= 100
        //
        //Output Format
        //
        //Stub code in the editor prints the sentence modified by the replaceAll line to stdout. The modified string must be a modified version of the initial sentence where all repeat occurrences of each word are removed.
        //
        //Sample Input
        //
        //5
        //Goodbye bye bye world world world
        //Sam went went to to to his business
        //Reya is is the the best player in eye eye game
        //in inthe
        //Hello hello Ab aB
        //Sample Output
        //
        //Goodbye bye world
        //Sam went to his business
        //Reya is the best player in eye game
        //in inthe
        //Hello Ab
        //Explanation
        //
        //We remove the second occurrence of bye and the second and third occurrences of world from Goodbye bye bye world world world to get Goodbye bye world.
        //We remove the second occurrence of went and the second and third occurrences of to from Sam went went to to to his business to get Sam went to his business.
        //We remove the second occurrence of is, the second occurrence of the, and the second occurrence of eye from Reya is is the the best player in eye eye game to get Reya is the best player in eye game.
        //The sentence in inthe has no repeated words, so we do not modify it.
        //We remove the second occurrence of ab from Hello hello Ab aB to get Hello Ab. It's important to note that our matching is case-insensitive, and we specifically retained the first occurrence of the matched word in our final string.

//        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
//        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
//
//        scanner = new Scanner(System.in);
//        number = scanner.nextInt();
//
//        for (i = 1; i <= number; i++) {
//            string = scanner.nextLine();
//
//            Matcher matcher = pattern.matcher(string);
//
//            // Check for subsequences of input that match the compiled pattern
//            while (matcher.find()) {
//                string = string.replaceAll(matcher.group(), matcher.group(1));
//            }
//
//            System.out.println(string);
//        }


        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher matcher = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (matcher.find()) {
                input = input.replaceAll(matcher.group(), matcher.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();

        // Task
        //Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line (see the Sample below for more detail).
        //
        //Note: 0 is considered to be an even index.
        //
        //Example
        //
        // S = adbecf
        //Print abc def
        //
        //Input Format
        //
        //The first line contains an integer, T(the number of test cases).
        //Each line I of the T subsequent lines contain a string, S.
        //
        //Constraints
        // 1<= T <= 10
        // 2<= length of S <= 10000
        //Output Format
        //
        //For each String Sj (where 0 <= j <= T-1), print Sj's even-indexed characters, followed by a space, followed by Sj's odd-indexed characters.
        //
        //Sample Input
        //
        //2
        //Hacker
        //Rank
        //Sample Output
        //
        //Hce akr
        //Rn ak

        number = scanner.nextInt();
        scanner.nextLine();

        for (i = 1; i <= number; i++) {
            string = scanner.nextLine();

            String evenString = "";
            String oddString = "";

            for (int j = 0; j < string.length(); j++) {
                if (j % 2 == 0) {
                    evenString += Character.toString(string.charAt(j));
                } else {
                    oddString += Character.toString(string.charAt(j));
                }
            }
            System.out.println(evenString + " " + oddString);
        }

        // Task
        //Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
        //
        //Example
        //
        // A = [1, 2, 3, 4]
        //Print 4 3 2 1. Each integer is separated by one space.
        //
        //Input Format
        //
        //The first line contains an integer, N(the size of our array).
        //The second line contains N space-separated integers that describe array A's elements.
        //
        //Constraints
        //
        // 1 <= N <= 1000
        // 1 <= A[i] <= 10000, where A[i] is the i integer in the array.
        //Output Format
        //
        //Print the elements of array A in reverse order as a single line of space-separated numbers.
        //
        //Sample Input
        //
        //4
        //1 4 3 2
        //Sample Output
        //
        //2 3 4 1

        n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        string = "";
        for (i = arr.size() - 1; i >= 0; i--) {
            string += arr.get(i) + " ";
        }

        System.out.println(string.trim());

        bufferedReader.close();

        // In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>. Note that the corresponding end tag starts with a /.
        //
        //Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:
        //
        //The name of the start and end tags must be same. The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
        //
        //Tags can be nested, but content between nested tags is considered not valid. For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
        //
        //Tags can consist of any printable characters.
        //
        //Input Format
        //
        //The first line of input contains a single integer, N(the number of lines).
        //The N subsequent lines each contain a line of text.
        //
        //Constraints
        //
        // 1 <= N <= 100
        //Each line contains a maximum of 10000 printable characters.
        //The total number of characters in all test cases will not exceed 1000000.
        //Output Format
        //
        //For each line, print the content enclosed within valid tags.
        //If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.
        //
        //Sample Input
        //
        //4
        //<h1>Nayeem loves counseling</h1>
        //<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
        //<Amee>safat codes like a ninja</amee>
        //<SA premium>Imtiaz has a secret crush</SA premium>
        //Sample Output
        //
        //Nayeem loves counseling
        //Sanjay has no watch
        //So wait for a while
        //None
        //Imtiaz has a secret crush

        testCases = Integer.parseInt(scanner.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            //Write your code here
            String patternString = "<(.+)>([^<]+)</\\1>";
            boolean isMatch = false;

            Pattern pattern = Pattern.compile(patternString);
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
                isMatch = true;
            }

            if (!isMatch) {
                System.out.println("None");
            }
            testCases--;
        }

        // Task
        //Given n names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each name queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for name is not found, print Not found instead.
        //
        //Note: Your phone book should be a Dictionary/Map/HashMap data structure.
        //
        //Input Format
        //
        //The first line contains an integer, n, denoting the number of entries in the phone book.
        //Each of the n subsequent lines describes an entry in the form of 2 space-separated values on a single line. The first value is a friend's name, and the second value is an 8-digit phone number.
        //
        //After the n lines of phone book entries, there are an unknown number of lines of queries. Each line (query) contains a name to look up, and you must continue reading lines until there is no more input.
        //
        //Note: Names consist of lowercase English alphabetic letters and are first names only.
        //
        //Constraints
        //
        // 1 <= n <= 100000
        // 1 <= queries <= 100000
        //Output Format
        //
        //On a new line for each query, print Not found if the name has no corresponding entry in the phone book; otherwise, print the full name and phoneNumber in the format name=phoneNumber.
        //
        //Sample Input
        //
        //3
        //sam 99912222
        //tom 11122222
        //harry 12299933
        //sam
        //edward
        //harry
        //Sample Output
        //
        //sam=99912222
        //Not found
        //harry=12299933
        //Explanation
        //
        //We add the following n=3(Key,Value) pairs to our map so it looks like this:
        //
        // phoneBook = {(sam, 99912222), (tom, 11122222), (harry, 12299933)}
        //We then process each query and print key=value if the queried key is found in the map; otherwise, we print Not found.
        //
        //Query 0: sam
        //Sam is one of the keys in our dictionary, so we print sam=99912222.
        //
        //Query 1: edward
        //Edward is not one of the keys in our dictionary, so we print Not found.
        //
        //Query 2: harry
        //Harry is one of the keys in our dictionary, so we print harry=12299933.

        n = scanner.nextInt();
        Map<String, Integer> phoneBook = new HashMap<>();
        for(i = 0; i < n; i++){
            String name = scanner.next();
            int phone = scanner.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }

        while(scanner.hasNext()){
            String s = scanner.next();
            // Write code here
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();






    }
}
