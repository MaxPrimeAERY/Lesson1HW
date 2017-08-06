package Task2;

/**
 * Created by Maximus on 06.08.2017.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;


    public double square(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        double p = (a + b + c) / 2;

        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            System.out.println("This triangle doesn't exist");
        }

        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
