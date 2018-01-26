class Arge {

    public static int nbYear(int p0, double percent, int aug, int p) {
        double p_work = p0;
        int years = 0;
        while (p_work < p) {
            p_work += p_work * percent/100 + aug;
            years++;
            System.out.println("p_work: " + p_work + " years: " + years);
        }
        return years;
    }

    public static void main (String[] args) {
        Arge pointer = new Arge();
        //System.out.println(pointer.nbYear(1500, 5, 100, 5000)); // 15
        //pointer.nbYear(1500000, 2.5, 10000, 2000000); // 10
        pointer.nbYear(1500000, 0.25, 1000, 2000000); // 94

    }
}