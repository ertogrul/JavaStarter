public class ReversedAgain {
    public static int[] digitize(long n) {
        String s = String.valueOf(n);
        int length = s.length();
        int [] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int) (s.charAt(i)) - 48;
            System.out.println(array[i]);
        }
    return array;

    }

    public static void main (String[] args) {
        ReversedAgain pointer = new ReversedAgain();
        pointer.digitize(12345);
    }

}
