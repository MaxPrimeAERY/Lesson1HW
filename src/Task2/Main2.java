package Task2;

/**
 * Created by Maximus on 06.08.2017.
 */
public class Main2 {
    public static void main(String[] args) {
        Triangle trioOne = new Triangle();
        Triangle trioTwo = new Triangle();
        double sqOne = trioOne.square(12, 16, 20);
        System.out.println("S1 = " + sqOne + " cm^2");
        System.out.println();
        double sqTwo = trioTwo.square(21.3, 27.44, 51.2);
        System.out.println("S2 = " + sqTwo + " cm^2");
    }
}
