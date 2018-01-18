public class ThisUsage {
    // high level x and y created
    static int x = 0;
    public int y = 0;

    //constructor creates new x and y that are shadowing high level x and y
    public ThisUsage(int a, int b) {
        x = a;
        y = b;
    }

    //  but it could have been written like this:
/*
    public class Point {
        public int x = 0;
        public int y = 0;

        //constructor
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }*/





    public static void main(String[] args) {
        ThisUsage pointer = new ThisUsage(3, 3);
        int x = 33;
        System.out.println("local var: " + x);
        System.out.println("high level var: " + pointer.x);
        System.out.println("STATIC high level var: " + ThisUsage.x);

    }
}
