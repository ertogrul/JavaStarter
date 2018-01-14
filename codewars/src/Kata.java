class Kata {
    static String noSpace(final String x) {
        return x.replace(" ", "");
    }

    public static void main (String[] args) {
        Kata myclass = new Kata();
        System.out.println(myclass.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
    }
}


