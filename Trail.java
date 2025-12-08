public class Trail {
    public double totalWeight;
    public double massOfDragWeiight;
    public double fric;
    public double accel;

    public static int totalTrails;

    public static final double gravityAccel = 9.81;

    public static final double massOfBlock = 82.0;
    public static final double massOfRect = 107.7;
    public static final double massOfHanging = 50.0;
    public static final double itterateWeight = 20.0;
    public static int weightNum = 0;

    public Trail(){}

    public Trail(double accel, boolean isBlock) {
        weightNum %= Main.maxTrail;

        this.massOfDragWeiight = (isBlock ? massOfBlock: massOfRect) +(itterateWeight*weightNum);
        this.totalWeight = massOfDragWeiight + massOfHanging;

        this.fric =-(((totalWeight*accel)-massOfHanging*gravityAccel))/(massOfDragWeiight*gravityAccel);
        this.accel = accel;
        weightNum++;
    }

    public static double averageFriction(Trail ...args) {
        double averageFric=0.0;
        for(Trail trail: args){
            averageFric+= trail.fric;
        }
        return averageFric/args.length;
    }
}