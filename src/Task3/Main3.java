package Task3;

/**
 * Created by Maximus on 06.08.2017.
 */
public class Main3 {
    public static void main(String[] args) {
        Vector3d vecA = new Vector3d(5, 8, 12);
        Vector3d vecB = new Vector3d(12, 16, -5);

        Vector3d vecC = new Vector3d();
        vecC.vectorSum(vecA, vecB);

        System.out.println(vecC);
        double resScalar = vecC.scalar(vecA, vecB);
        System.out.println("Scalar = " + resScalar);
        double resVectorX = vecC.vectorX(vecA, vecB);
        System.out.println("VectorX = " + resVectorX);//векторное произведение
    }
}
