public class SumKataAgain {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) return 0;
        int min,max,sum;
        sum = min = max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }
        return sum - min - max;
    }

    public static void main(String[] args) {
        SumKataAgain pointer = new SumKataAgain();
        pointer.sum(new int[] { 6, 2, 1, 8, 10 });  // 16
        //pointer.sum(new int[] { 1, 1, 11, 2, 3 });  // 6
        //pointer.sum(new int[] {-6, -20, -1, -10, -12});// -28
        //pointer.sum(new int[] {6, 0, 1, 10, 10});//17
        pointer.sum(new int[] {});
    }
}