import java.util.ArrayList;
class StepInPrimes {

    public static long[] step(int g, long m, long n) {
        // g - step
        // m - search start
        // n - search end
        //
        // to do:
        // - list primes
        // - look for way to count steps between them
        //
        long[] firstPair = new long [2];
        //long[] tempArr = new long [10];
        ArrayList tempArr = new ArrayList();

        for (int i = 3; i <= n; i++) {
            if (isPrime(i) == true) {
                //System.out.println(i);
                tempArr.add(i);
                System.out.println("tempArr: " + tempArr);
                if (tempArr.size() > 1) {
                    for (int z = 0; z < tempArr.size(); z++) {
                        System.out.println("XXXX "+tempArr.get(z));

                        int a = (int) tempArr.get(z);
                        //ArrayList b = tempArr.get(z-1);
                        /*if (tempArr.get(z) - tempArr.get(z - 1) == g) {
                            firstPair[0] = z;
                            firstPair[1] = i;
                            break;
                        }*/
                    }

                }

            }

        }

        return firstPair;
    }

    public static boolean isPrime(long n) {
        if (n % 2 == 0) return false;
        for(int i = 3; i * i <= n; i += 2) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void main (String[] args) {
        StepInPrimes pointer = new StepInPrimes();
        System.out.println(pointer.step(2, 2, 50)); // [3,5]
        // pointer.step(2, 5, 7); // [5, 7]
        // pointer.step(2, 5, 5); // [ ]
        // pointer.step(2,100,110); // [101, 103]
        // pointer.step(4, 100, 110); // [103, 107]
        // pointer.step(6, 100, 110); // [101, 107]
        // pointer.step(8, 300, 400); // [359, 367]
        // pointer.step(10, 300, 400); // [307, 317]
    }
}