import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class HackerRankPracticeSolution {
    public  static void main(String[] args) throws IOException {
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

    }
}
