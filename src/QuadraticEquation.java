public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        double r1;
        r1 = ((-b) + Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        return r1;
    }

    public double getRoot2() {
        double r2;
        r2 = ((-b) - Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        return r2;
    }
}
