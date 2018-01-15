public class SumKata {
    public static int sum(int[] numbers) {
        int result = 0;
        int max = 0;
        int min = 1000;
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

        for (int j = 0; j < numbers.length; j ++) {
            if (((numbers[j]) == max) || (numbers[j] == min)) {
                continue;
            }
            System.out.println("adding: " + numbers[j]);
            result += numbers[j];

        }

        return result;
    }

    public static void main(String[] args) {
        SumKata pointer = new SumKata();
        pointer.sum(new int[] { 6, 2, 1, 8, 10 });  // 16
        // pointer.sum({ 1, 1, 11, 2, 3 });  // 6
    }
}