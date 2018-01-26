public class GpsSpeed {

    /*
    Return as an integer the *floor* of the maximum average speed per hour obtained on the sections of x.
    If x length is less than or equal to 1 return 0 since the car didn't move.

     */

    public static int gps(int s, double[] arr) {
        double distance;
        double max_average_speed = 0;
        double speed;
        if (arr.length <= 1) return 0;
        for (double a : arr) System.out.println(a);

        for (int b = 0; b <  arr.length - 1; b++) {
            distance = arr[b+1] - arr[b];
            System.out.println("distance: " + distance);
            speed = (3600 * distance) / s;
            System.out.println("speed: " + speed);
            if (speed > max_average_speed) {
                max_average_speed = speed;
                System.out.println("new max spped recognized: " + max_average_speed);
            }

        }


        return (int)(max_average_speed);


    }

    public static void main (String[] args) {
        GpsSpeed pointer = new GpsSpeed();
        //double[] arr = new double[] {0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61};
        //System.out.println(pointer.gps(20, arr)); // 41
        //double[] arr = new double[] {0.0, 0.11, 0.22, 0.33, 0.44, 0.65, 1.08, 1.26, 1.68, 1.89, 2.1, 2.31, 2.52, 3.25};
        //System.out.println(pointer.gps(12, arr)); // 219
        double[] arr = new double[] {0.0, 0.18, 0.36, 0.54, 0.72, 1.05, 1.26, 1.47, 1.92, 2.16, 2.4, 2.64, 2.88, 3.12, 3.36, 3.6, 3.84};
        System.out.println(pointer.gps(20, arr)); // 80
    }


}