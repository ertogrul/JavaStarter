import java.lang.Math;
public class Polygon {

    public static double areaOfPolygonInsideCircle(double circleRadius, int numberOfSides) {
        double AreaOfPolygon = (numberOfSides * Math.pow(circleRadius, 2d) * Math.sin((2 * 3.14159) / numberOfSides))/2;
        AreaOfPolygon *= 1000;
        AreaOfPolygon = Math.round(AreaOfPolygon);
        AreaOfPolygon /= 1000;
        return AreaOfPolygon;

    }

    public static void main (String[] args) {
        Polygon pointer = new Polygon();
        System.out.println(pointer.areaOfPolygonInsideCircle(3, 3)); // 11.691
        // pointer.areaOfPolygonInsideCircle(2, 4); // 8
        // pointer.areaOfPolygonInsideCircle(2.5, 5); // 14.86
        // pointer.areaOfPolygonInsideCircle(5.8, 7); // 92.053
        // pointer.areaOfPolygonInsideCircle(4, 5); // 38.042
    }


}