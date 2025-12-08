public class Trail {
    public double totalMass;
    public double massOfDrag;
    public double fric;
    public double accel;

    public static int totalTrails;

    public static final double gravityAccel = 9.81;

    public static final double massOfBlock = .082;
    public static final double massOfRect = .1077;
    public static final double massOfHanging = 0.050;
    public static final double itterateWeight = .020;
    public static int weightNum = 0;

    public Trail(){}

    public Trail(double accel, boolean isBlock) {
        weightNum %= Main.maxTrail;

        this.massOfDrag = ((isBlock ? massOfBlock: massOfRect) +(itterateWeight*weightNum));
        this.totalMass = (massOfDrag + massOfHanging);
        this.accel = accel/100;
        this.fric = -((totalMass*this.accel)-(massOfHanging*gravityAccel))/(massOfDrag*gravityAccel);
        System.out.println((massOfDrag*gravityAccel));
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