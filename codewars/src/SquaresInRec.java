public class SquaresInRec {
    public static int findSquares(int x, int y) {
        boolean s = true;
        //int numberOfSquares = x * y;
        int numberOfSquares = 0;
        //int squareSize = 1;
        int squareSize = 0;
        int a;
        int b;
        while (s == true) {
            if ((squareSize <= x) && (squareSize <= y)) {
                squareSize++;
                a = x - squareSize + 1;
                b = y - squareSize + 1;
                numberOfSquares += a * b;
                //System.out.println("numberofsquares: " + numberOfSquares);
            } else {
                s = false;
            }
        }
        return numberOfSquares;
    }

    public static void main(String[] args) {
        SquaresInRec pointer = new SquaresInRec();
        // System.out.println(pointer.findSquares(3, 2)); // 8
        // System.out.println(pointer.findSquares(4,3)); // 20
        //System.out.println(pointer.findSquares(11, 4)); // 100
    }
}