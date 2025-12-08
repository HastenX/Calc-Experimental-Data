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
            System.out.println("Weight (g); "+ (trail.totalMass) +":");
            System.out.println("Friction Force (N):  " + Math.abs(((trail.totalMass/1000)*(trail.accel))-((trail.massOfDrag/1000)*Trail.gravityAccel)));
            System.out.println("Normal Force (N): " + Math.abs(trail.massOfDrag*Trail.gravityAccel));
            System.out.println("Average Friction coefficent: " + Math.abs(trail.fric));
        }
        System.out.println("Total Average Friction coefficent: " + Math.abs(Trail.averageFriction(trails)));
        System.out.println("\n");
    }
}
