public class Collatz {
    public static long conjecture(long x) {
        int counter = 1;
        while (x > 1) {
            x = (x % 2 == 0) ? x / 2 : x * 3 + 1;
            //System.out.println(x);
            counter ++;
        }
        return counter;
    }

    public static void main (String[] args) {
        Collatz pointer = new Collatz();
        System.out.println(pointer.conjecture(20));
    }
}