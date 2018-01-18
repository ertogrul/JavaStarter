class DivSevenAgain {
    public static long[] seven(long m) {
        long last = 0;
        long steps = 0;
        while (m >= 100) {
            last = m % 10;
            System.out.println("last "+last);
            m = (m) / 10 - 2 * last;
            System.out.println("m "+m);
            steps++;
            System.out.println("steps "+steps);
        }
        return new long[] {m,steps};
    }

    public static void main(String[] args) {
        DivSevenAgain pointer = new DivSevenAgain();
        // System.out.println(pointer.seven(371));
        //System.out.println(pointer.seven(1603));
        System.out.println(pointer.seven(483));
    }
}