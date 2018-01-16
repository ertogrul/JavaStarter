public class ReturnNegative {

    public static int makeNegative(final int x) {
        System.out.println(x);
        if (x <= 0) return x;
        return x * -1;
    }

    /*
    public static int makeNegative(final int x) {
        return -abs(x);
    }*/

}