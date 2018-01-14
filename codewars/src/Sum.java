import java.util.Arrays;
import java.util.stream.*;

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        // arrays
        //int[] arr3 = {1, 2, 3, 4, 5};
        //int arrSum = 0;
        //System.out.println("arr3: " + Arrays.toString(arr3));
        //System.out.println("arr3 length: " + arr3.length);


        // traditional loops
        /*
        for (int i=0; i < arr1.length; i++) {
            arrSum += arr1[i];
            System.out.println(arrSum);
        }
        for (int i=0; i < arr2.length; i++) {
            arrSum += arr2[i];
            System.out.println(arrSum);
        }
        return arrSum;*/

        // stream instead of loop
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();

    }
    public static void main (String[] args) {
        Sum pointer = new Sum();
        System.out.println(pointer.arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
    }
}
