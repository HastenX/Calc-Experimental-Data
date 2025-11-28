public class Trail {
    public double totalWeight;
    public double fric;
    public double accel;

    public static int totalTrails;

    public static final double gravityAccel = -9.81;

    public static final double massOfBlock = 82.0;
    public static final double massOfRect = 107.7;
    public static final double massOfHanging = 50.0;
    public static final double itterateWeight = 20.0;
    public static int weightNum = 0;

    public Trail(){}

    public Trail(double accel, boolean isBlock) {
        weightNum %= Main.maxTrail;
        this.totalWeight = massOfHanging + (isBlock ? massOfBlock: massOfRect) +(itterateWeight*weightNum);

        this.fric =-(((totalWeight*accel)-(massOfHanging*gravityAccel))/(massOfBlock*gravityAccel));
        this.accel = accel;
        weightNum++;
    }

}