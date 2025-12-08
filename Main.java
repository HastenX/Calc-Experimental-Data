import java.util.Scanner;

public class Main {
    private static Trail[] trails;
    private static CompleteSide[] sides;

    private static Scanner scan = new Scanner(System.in);
    public static final int maxTrail=3;
    public static final int maxSides=7;
    private static boolean isBlock;
    private static double totalAccel;

    public static void main(String[] args) {
        sides = new CompleteSide[maxSides];
        for(int i=0; i< maxSides; i++) {
            scan = new Scanner(System.in);
            System.out.println("Side "+ (i+1) +":");
            System.out.println("Enter is Block:");
            isBlock = scan.nextLine().equals("t");
            System.out.println("-\n");
            trails = new Trail[maxTrail];
            for(int j=0; j< maxTrail; j++){
                System.out.println("Trail "+(j+1)+":");
                System.out.println("Enter Accel(cm):");
                totalAccel=0;
                for(int k=0; k< maxTrail; k++) {
                    totalAccel+= scan.nextDouble();
                }
                trails[j] = new Trail(totalAccel/3, isBlock);
            }
            sides[i] = new CompleteSide(trails);
        }
        for(CompleteSide side : sides) {
            side.outResults();
        }
    }
}
