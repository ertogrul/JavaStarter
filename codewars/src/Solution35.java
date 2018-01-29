public class Solution35 {

    public int solution(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                System.out.println(sum);
            }
        }
        return sum;
    }

    public static void main (String[] args) {
        Solution35 pointer = new Solution35();
        pointer.solution(10); // 23

    }
}