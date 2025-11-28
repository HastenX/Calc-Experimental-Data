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
            System.out.println("Average Accel: " + trail.accel);
            System.out.println("Average Friction: " + trail.fric);
        }
        System.out.println("\n");
    }
}
