public class Movie {

    public static int movie(int card, int ticket, double perc) {
        int A;
        int B;
        int n = 3;
        do {
            A = ticket * n;
            //B = card * ticket * Math.pow(perc, n);
            System.out.println("A: " + A);
            //System.out.println("B: " + B);
            n++;
        } while (n < 100 /*A > B*/);
        return 10;
    }

    public static void main (String[] args) {
        Movie pointer = new Movie();
        System.out.println(pointer.movie(500, 15, 0.9)); // should return 43
        //System.out.println(pointer.movie(100, 10, 0.95)); // should return 24
    }
}