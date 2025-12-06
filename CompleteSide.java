public class CompleteSide extends Trail{
    private static int totalSides =0;
    private int side =0;
    private Trail[] trails;

    public CompleteSide(Trail ...trails) {
        this.trails = trails;
        this.side = totalSides;
        totalSides++;
    }

    public void outResults() {
        System.out.println("Side "+ (this.side+1)+ ":");
        for(Trail trail: trails) {
            System.out.println("Weight "+ (trail.totalWeight) +":");
            System.out.println("Friction Force: " + (((massOfHanging*gravityAccel)-(trail.totalWeight*trail.accel))));
            System.out.println("Normal Force: " + trail.accel);
            System.out.println("Average Friction coefficent: " + trail.fric);
        }
        System.out.println("Total Average Friction: " + Trail.averageFriction(trails));
        System.out.println("\n");
    }
}
