public class IntSqRoot {
    public static long IntRac(long n, long guess)  {
        int count = 0;
        long previous_guess;
        do {
            System.out.println("count: "+count++);
            previous_guess = guess;
            guess = (guess + n / guess) / 2;
            System.out.println("guess: " + guess);
            System.out.println("while condition: " + (guess - previous_guess));
        } while (Math.abs(guess - previous_guess) >= 1);
        return count;
    }

    public static void main (String[] args) {
        IntSqRoot pointer = new IntSqRoot();
        //System.out.println(pointer.IntRac(25, 1)); // should return 4;
        //System.out.println(pointer.IntRac(125348,300)); // should return 3;
        //System.out.println(pointer.IntRac(125348981764L,356243)); // should return 3;
        System.out.println(pointer.IntRac(13020814, 1)); // should return 3;
        // pointer.IntRac(); // should return 3;
    }
}