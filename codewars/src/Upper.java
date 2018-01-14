
class Upper{
    public static String MakeUpperCase(String str){
        //return str.toUpperCase();
        return str == null ? null : str.toUpperCase();
    }

    public static void main (String[] args) {
        Upper pp = new Upper();
        System.out.println("Wynik: "+ pp.MakeUpperCase("hello my friend"));
    }
}


