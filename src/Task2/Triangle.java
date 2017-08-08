package Task2;

/**
 * Created by Maximus on 06.08.2017.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        super();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double square() {
        double p = (this.a + this.b + this.c) / 2;

        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            System.out.println("This triangle doesn't exist");
        }

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
