import java.util.ArrayList;
import java.lang.*;

class StepInPrimes {

    public static long[] step(int g, long m, long n) {
        // g - step
        // m - search start
        // n - search end

        ArrayList tempArr = new ArrayList();
        int counter = 0;
        long [] arr = {0, 0};
        boolean resultFound = false;

        if (m == n) return new long [] {};

        for (long i = m; i <= n; i++) {
            if (isPrime(i) == true) {
                tempArr.add(i);
            }
        }

        for (int j = 0; j < tempArr.size(); j++) {
            for (int shiftVar = 1; shiftVar < tempArr.size() - counter; shiftVar++) {
                if (resultFound == true) break;

                long temp2 =  (long) tempArr.get(j+shiftVar) - (long) tempArr.get(j);
                if (temp2 == g) {
                    arr[0] = (long) tempArr.get(j);
                    arr[1] = (long) tempArr.get(j+shiftVar);
                    resultFound = true;
                    break;
                }
            }
            counter++;

        }

        if (arr[1] == 0) return null;
        return arr;
    }

    public static boolean isPrime(long n) {
        if (n % 2 == 0) return false;
        for(int a = 3; a * a <= n; a += 2) {
            if(n % a == 0) return false;
        }
        return true;
    }
    public static void main (String[] args) {
        // StepInPrimes pointer = new StepInPrimes();
        // StepInPrimes.step(2, 2, 50); // [3,5]
        // StepInPrimes.step(2, 5, 7); // [5, 7]
        // StepInPrimes.step(2, 5, 5); // [ ]
        // StepInPrimes.step(2,100,110); // [101, 103]
        // StepInPrimes.step(4, 100, 110); // [103, 107]
        // StepInPrimes.step(6, 100, 110); // [101, 107]
        // StepInPrimes.step(8, 300, 400); // [359, 367]
        // StepInPrimes.step(10, 300, 400); // [307, 317]
    }
}