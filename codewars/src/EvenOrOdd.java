public class EvenOrOdd {
    public static String even_or_odd(int number) {
        return (number%2 == 0) ? "Even" : "Odd";
        /*
        String even = "Even";
        String odd = "Odd";
        if (number % 2 == 0) {
            return even;
        } else {
            return odd;
        }*/

    }

    public static void main (String[] args) {
        EvenOrOdd pointer = new EvenOrOdd();
        System.out.println(pointer.even_or_odd(33));
    }
}