public class CharProblem {
    public static int howOld(final String age) {
        //your code here, return correct age as int ; )
        //System.out.println(age);
        //System.out.println(age.charAt(0));
        //int numberAge = (int) age.charAt(0)-48;
        //System.out.println(numberAge);
        //return numberAge;
        return (int) age.charAt(0)-48;

    }

    public static void main(String[] args) {
        CharProblem bum = new CharProblem();
        System.out.println(bum.howOld("5 years old"));
        //bum.howOld("9 years old");
        //bum.howOld("1 years old");
    }
}