package exercise;

// BEGIN
public class Circle extends Point {
Point ex;
int radius;

Circle(Point ex, int radius) {
    super(ex.getX(), ex.getY());
    this.radius = radius;
}

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
       var square = radius * radius * Math.PI;
    if (radius < 0) {
        throw new NegativeRadiusException();
    }
    return square;
    }
}
// END
