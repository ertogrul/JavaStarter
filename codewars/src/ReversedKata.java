public class ReversedKata {
    public static int[] digitize(long n) {
        String s = String.valueOf(n);
        int length = s.length();
        int [] array = new int[length];
        for (int i = 0; i < length; i++) {
            //array[i] = (int) (s.charAt(i)) - 48;
            array[i] = (int) (s.charAt(length - i  - 1)) - 48;
            System.out.println(array[i]);
        }

        return array;


    }


    public static void main(String[] args) {
        ReversedKata pointer = new ReversedKata();
        pointer.digitize(35231);

    }
}


