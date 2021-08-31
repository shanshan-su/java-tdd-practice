public class Add {
    public Add(){}

    public String add(int number1, int number2) {
        return Integer.toString(number1) + "+" + Integer.toString(number2) + "=" + Integer.toString(number1 + number2);
    }

    public String add(int number1, int number2, int number3) {
        return Integer.toString(number1) + "+" + Integer.toString(number2) + "+" + Integer.toString(number3) + "=" + Integer.toString(number1 + number2 + number3);
    }

    public String add(int number1, int number2, int number3, int number4, int number5) {
        return Integer.toString(number1) + "+" + Integer.toString(number2) +  "+" + Integer.toString(number3) + "+" + Integer.toString(number4) + "+" + Integer.toString(number5) + "=" + Integer.toString(number1 + number2 + number3 + number4 + number5);
    }

    public String add(int number1, int number2, int number3, int number4, int number5, int number6) {
        return Integer.toString(number1) + "+" + Integer.toString(number2) + "+" + Integer.toString(number3) + "+" + Integer.toString(number4) + "+" + Integer.toString(number5) + "+" + Integer.toString(number6) + "=" + Integer.toString(number1 + number2 + number3 + number4 + number5 + number6);
    }
}
