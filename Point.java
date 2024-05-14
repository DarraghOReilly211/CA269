public interface Order {
    public boolean lessThan(Order other);
}

public interface Comparable {
    public int compareTo(Comparable other);
}

public class Point implements Order, Comparable {
    private double x, y;

    public Point (double newX, double newY) {
        x = newX;
        y = newY;
    }
    public boolean lessThan(Order other) {
        Point otherPoint = (Point) other;
        return (x < otherPoint.x) || (x == otherPoint.x && y < otherPoint.y);
    }

    public int compareTo(Comparable other) {
        Point otherPoint = (Point) other;
        if (x < otherPoint.x) {
            return -1;
        } else if (x == otherPoint.x) {
            if (y < otherPoint.y) {
                return -1;
            } else if (y == otherPoint.y) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }	

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Order O1 = new Point(0, 0);
        Order O2 = new Point(1, 1);
        Order O3 = new Point(0, 1);
        
        System.out.println("O1 less than O2: " + O1.lessThan(O2)); // true
        System.out.println("O1 less than O3: " + O1.lessThan(O3)); // true
        System.out.println("O2 less than O3: " + O2.lessThan(O3)); // false
        System.out.println("O3 less than O3: " + O3.lessThan(O3)); // false
        Comparable P1 = new Point(0, 0);
        Comparable P2 = new Point(1, 1);
        Comparable P3 = new Point(0, 1);

        System.out.println("P1 less than P2: " + P1.compareTo(P2)); // -1
        System.out.println("P1 less than P3: " + P1.compareTo(P3)); // -1
        System.out.println("P2 less than P3: " + P2.compareTo(P3)); // 1
        System.out.println("P3 less than P3: " + P3.compareTo(P3)); // 0
        }
}

