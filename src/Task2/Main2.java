package Task2;

/**
 * Created by Maximus on 06.08.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        Triangle trioOne = new Triangle(12,16,18);
        Triangle trioTwo = new Triangle(2,4,20);
        double sqOne = trioOne.square();

        System.out.println("S1 = " + sqOne + " cm^2");
        System.out.println();
        double sqTwo = trioTwo.square();
        System.out.println("S2 = " + sqTwo + " cm^2");
    }
}
