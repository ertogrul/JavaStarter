import java.util.*;
public class TwoToOne {

    public static String longest (String s1, String s2) {
        String oneString = s1 + s2;
        ArrayList<String> list = new ArrayList();

        String temp;

        for (int i = 0; i < oneString.length(); i++) {
            //System.out.println(oneString.charAt(i));
            //temp = oneString.charAt(i);
            temp = oneString.substring(i, i+1);
            if (list.contains(temp)) {
                System.out.println("Char not added: " + temp);
            } else {
                //list.add(oneString.charAt(i));
                list.add(oneString.substring(i,i+1));
            }
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        String res = String.join("", list);
        System.out.println(res);


        return res;
    }

    public static void main (String[] args) {
        TwoToOne pointer = new TwoToOne();
        System.out.println(pointer.longest("aretheyhere", "yestheyarehere")); // "aehrsty"
        // pointer.longest("loopingisfunbutdangerous", "lessdangerousthancoding"); // "abcdefghilnoprstu"
        //pointer.longest("inmanylanguages", "theresapairoffunctions"); // "acefghilmnoprstuy"
    }
}