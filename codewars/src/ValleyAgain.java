import java.util.Arrays;

public class ValleyAgain {
    public static int[] makeValley(int[] arr) {
        int[] arr2 = new int[arr.length];
        Arrays.sort(arr);
        for (int a = 0; a < arr2.length; a++) {
            System.out.println("a = "+ a);
            if (a % 2 == 0) {
                arr2[a/2] = arr[arr.length-1-a];
                System.out.println("arr.length-1-a: " + (arr.length-1-a) + " a/2: " + a/2);
            }
            else {
                System.out.println("arr[arr.length-1-a]: " + arr[arr.length-1-a] + " arr2[arr.length-a/2]: " + arr2[arr.length-1-a/2]);
                arr2[arr.length-1-a/2] = arr[arr.length-1-a];

            }
        }

        for (int x : arr2) System.out.println(x);

        return arr2;
    }

    public static void main (String[] args) {
        ValleyAgain pointer = new ValleyAgain();
        pointer.makeValley(new int [] {79, 35, 54, 19, 35, 25});
    }
}
