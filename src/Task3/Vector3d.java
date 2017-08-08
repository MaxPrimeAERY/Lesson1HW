package Task3;

/**
 * Created by Maximus on 06.08.2017.
 */
public class Vector3d {
    private double aS;
    private double bS;
    private double cS;


    public Vector3d(double aS, double bS, double cS) {
        this.aS = aS;
        this.bS = bS;
        this.cS = cS;

    }

    public Vector3d() {
        this.aS = 0;
        this.bS = 0;
        this.cS = 0;
    }


    public void vectorSum(Vector3d vecA, Vector3d vecB) {
        this.aS = vecA.aS + vecB.aS;
        this.bS = vecA.bS + vecB.bS;
        this.cS = vecA.cS + vecB.cS;

    }

    public double scalar(Vector3d vecA, Vector3d vecB) {
        double scalarRes = vecA.aS * vecB.aS + vecA.bS + vecB.bS + vecA.cS + vecB.cS;
        return scalarRes;
    }

    public double vectorX(Vector3d vecA, Vector3d vecB) {
        double scalarRes = vecA.aS * vecB.aS + vecA.bS + vecB.bS + vecA.cS + vecB.cS;
        double vecARes = Math.sqrt(Math.pow(vecA.aS, 2) + Math.pow(vecA.bS, 2) + Math.pow(vecA.cS, 2));
        double vecBRes = Math.sqrt(Math.pow(vecB.aS, 2) + Math.pow(vecB.bS, 2) + Math.pow(vecB.cS, 2));
        double cosinus = Math.cos(scalarRes / (vecARes * vecBRes));
        double sinus = 1 - Math.sqrt(Math.pow(cosinus, 2));
        double vecX = vecARes * vecBRes * sinus;

        return vecX;
    }

    @Override
    public String toString() {
        return "Vector C(" +
                "a=" + aS +
                ", b=" + bS +
                ", c=" + cS +
                ')';
    }

}
