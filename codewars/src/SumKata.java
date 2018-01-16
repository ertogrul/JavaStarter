import java.util.Arrays;
public class SumKata {
    public static int sum(int[] numbers) {
        System.out.println("numbers: " + Arrays.toString(numbers));
        int result = 0;
        int max = -1000;
        int min = 1000;

        if (numbers == null) return result;

        //find max and min
        for (int i = 0; i < numbers.length; i ++) {
            System.out.println(numbers[i]);
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        //add array values
        boolean maxFound = false;
        boolean minFound = false;
        for (int j = 0; j < numbers.length; j ++) {
            if (numbers[j] == max && maxFound == false) {
                maxFound = true;
                continue;
            }
            if (numbers[j] == min && minFound == false) {
                minFound = true;
                continue;
            }
            System.out.println("adding: " + numbers[j]);
            result += numbers[j];

        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        SumKata pointer = new SumKata();
        pointer.sum(new int[] { 6, 2, 1, 8, 10 });  // 16
        //pointer.sum(new int[] { 1, 1, 11, 2, 3 });  // 6
        //pointer.sum(new int[] {-6, -20, -1, -10, -12});// -28
        //pointer.sum(new int[] {6, 0, 1, 10, 10});//17
        //pointer.sum(new int[] {});
    }
}