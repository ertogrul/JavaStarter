import java.util.ArrayList;

public class IterateThis {
    // ITERATE USING STRING
    /*
    public static ArrayList<Integer> metoda(long number) {

        ArrayList<Integer> result = new ArrayList<>();
        String s = Long.toString(number);

        for (int i = 0; i < s.length(); i++) {
            result.add(s.charAt(i) - '0');
            System.out.println(result);
        }
        return result; // MSD at start of list
    }*/

    // ITERATE USING MODULO
    public static ArrayList<Integer> metoda(long number) {

        ArrayList<Integer> result = new ArrayList<>();

        while (number > 0) {
            int digit = (int) (number % 10);
            result.add(digit);
            System.out.println(result);
            number /= 10;
        }
        return result; // LSD at start of list
    }

    public static void main(String[] args) {
        IterateThis pointer = new IterateThis();
        pointer.metoda(2342342);
    }
}
