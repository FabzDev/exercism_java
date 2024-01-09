package triangleExercise;

public class Triangle2 {
    private double a;
    private double b;
    private double c;

    public Triangle2(double a, double b, double c) throws TriangleException {
        if (!(a > 0 && b > 0 && c > 0 && a + b >= c && b + c >= a && a + c >= b))
            throw new TriangleException();

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isEquilateral() {
        return a == b && a == c;
    }

    public boolean isIsosceles() {
//        return (a==b && a!=c) || (a==c && a!=b) || (b==c && a!=b) || isEquilateral();
        return (!isEquilateral() && !isScalene()) || isEquilateral();
    }

    public boolean isScalene() {
        return a != b && a != c && b != c;
    }

    public static void main(String[] args) {
        Triangle2 t = null;
        try {
            t = new Triangle2(0.5, 0.5, 0.5);
        } catch (TriangleException e) {
            throw new RuntimeException(e);
        }
        t.isEquilateral();
    }
}
