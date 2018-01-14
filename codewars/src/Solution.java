public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        String myString = "";
        for (int x = 0; x < repeat; x++) System.out.println(myString += string);
        return myString;
    }
    public static void main (String[] args) {
        Solution x = new Solution();
        x.repeatStr(4, "a");
    }
}
