public class Movie {
/*
    public static int movie(int card, int ticket, double perc) {
        int A;
        double B;
        int n = 1;
        double prev_tickets = 0;
        do {
            A = ticket * n;
            B = card + ticket * Math.pow(perc, n) + prev_tickets;
            prev_tickets += ticket * Math.pow(perc, n);
            //System.out.println("A: " + A);
            //System.out.println("B: " + B);
            n++;
        } while (A < Math.ceil(B));
        return n-1;
    }
*/

    public static int movie(int card, int ticket, double perc) {
        int count = 0;
        double totalB = card;

        while (ticket * count <= Math.ceil(totalB)) {
            totalB += ticket * Math.pow(perc, ++count);
        }

        return count;
    }

    public static void main (String[] args) {
        Movie pointer = new Movie();
        System.out.println(pointer.movie(500, 15, 0.9)); // should return 43
        //System.out.println(pointer.movie(100, 10, 0.95)); // should return 24
        //System.out.println(pointer.movie(0, 10, 0.95)); // should return 2
    }
}