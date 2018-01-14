public class RemoveChars {
    public static String remove(String str) {
        //best practice
        return str.substring(1, str.length() - 1);
        // my way
        /*
        String outStr = "";
        System.out.println(str.length());
        if (str.length() < 2) {
            return null;
        }
        else {
            for (int a = 0; a < str.length(); a++) {
                if (a == 0 || a == str.length()-1) {
                    continue;
                }
                outStr += str.charAt(a);
                System.out.println(str.charAt(a));
                System.out.println(outStr);


            }
            return outStr;

        }*/


    }

    public static void main (String[] args) {
        RemoveChars pp = new RemoveChars();

        // pp.remove("eloquent");
        // pp.remove("party");
        // pp.remove("person");
        // pp.remove("place");
        pp.remove("aa");

    }
}