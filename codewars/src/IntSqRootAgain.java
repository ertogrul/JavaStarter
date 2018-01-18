public class  IntSqRootAgain{
    public static long IntRac(long n, long guess)  {
        int counter = 0;
        for ( long prevGuess = 0; Math.abs(guess - prevGuess) >= 1; counter++ ) {
            prevGuess = guess;
            guess = ( guess + n / guess ) / 2;
        }
        return counter;
    }


    public static void main (String[] args) {
        IntSqRootAgain pointer = new IntSqRootAgain();
        //System.out.println(pointer.IntRac(25, 1)); // should return 4;
        //System.out.println(pointer.IntRac(125348,300)); // should return 3;
        //System.out.println(pointer.IntRac(125348981764L,356243)); // should return 3;
        System.out.println(pointer.IntRac(13020814, 1)); // should return 3;
        // pointer.IntRac(); // should return 3;
    }
}
