import java.util.Scanner;;

public class ParkingLot11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type;
        int duration;
        int total = 0;

        do {
            System.out.print("Enter Vehicle Type (type '0' to exit): ");
            type = sc.nextInt();
            if (type == 1 || type == 2) {
                System.out.print("Enter Duration: ");
                duration = sc.nextInt();
                if (type == 1) {
                    total += duration * 3000;
                } else {
                    total += duration * 2000;
                }
            }
        } while (type != 0);
            System.out.println("Total Parking: " + total);
        
        sc.close();
    }
}
