public class SentenceBuilder {
    public static void main (String[] args) {
        //three groups of words
        String[] words1 = {"architektura wielowarstwowa", "rozwiązanie B2B", "aplikacja kliencka"};
        String[] words2 = {"zwiększa możliowści", "opracowana dla", "skoncentrowana na"};
        String[] words3 = {"procesu", "punktu wpisywania", "witryny"};

        //how many words in each list
        int words1length = words1.length;
        int words2length = words2.length;
        int words3length = words3.length;

        //generate 3 random words
        int rnd1 = (int) (Math.random() * words1length);
        int rnd2 = (int) (Math.random() * words2length);
        int rnd3 = (int) (Math.random() * words3length);

        //create a sentence
        String sentence = words1[rnd1] + " " + words2[rnd2] + " " + words3[rnd3];
        System.out.println(sentence);
    }
}
