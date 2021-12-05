package learn;

/**
 * @author 风雪中的白灵
 */
public class Point
{
    double x;
    double y;
    double z;

    Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    double getDistance(Point p) {
        return (x - p.x) * (x - p.x) + (y - p.y) * (y - p.y) + (z - p.z) * (z - p.z);
    }

    public static void valueOf(int i) {
    }
}
