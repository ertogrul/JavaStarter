public class SentenceBuilder {
    public static void main (String[] args) {
        //three groups of words
        String[] words1 = {"architektura wielowarstwowa", "rozwiązanie B2B", "aplikacja kliencka"};
        String[] words2 = {"zwiększa możliowści", "opracowana dla", "skoncentrowana na"};
        String[] words3 = {"procesu", "punktu wpisywania", "witryny"};

        //generate 3 random words
        //float rnd1 =  (float) (Math.random() * words1.length);
        int rnd1 = (int) (Math.random() * (int) words1.length);
        int rnd2 = (int) (Math.random() * (int) words2.length);
        int rnd3 = (int) (Math.random() * (int) words3.length);

        System.out.println(words1[rnd1] + " " + words2[rnd2] + " " + words3[rnd3]);
    }
}

