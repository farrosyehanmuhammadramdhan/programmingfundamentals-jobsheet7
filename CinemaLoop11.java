import java.util.Scanner;;

public class CinemaLoop11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        double ticketPrice = 50000;
        int totalTicketsSold = 0;
        double totalIncome = 0;
        int totalTickets;
        double discount;
        double totalBeforeDiscount;
        double totalPay;

        System.out.println("=== Cinema Ticket Sales System ===");

        do {
            System.out.print("Enter the number of tickets purchased (type 0 to exit): ");
            totalTickets = sc.nextInt();

            // Negative Input Validation
            if (totalTickets < 0) {
                System.out.println("Invalid ticket amount (cannot be negative)! Please re-enter.\n");
                continue;
            }

            // Transaction Stop
            if (totalTickets == 0) {
                break;
            }

            // Discount
            discount = 0.0;
            if (totalTickets > 10) {
                discount = 0.15;
            } else if (totalTickets > 4) {
                discount = 0.10;
            }

            // Counting Transaction
            totalBeforeDiscount = totalTickets * ticketPrice;
            totalPay = totalBeforeDiscount - (totalBeforeDiscount * discount);

            // Total Acumulation
            totalTicketsSold += totalTickets;
            totalIncome += totalPay;

            System.out.printf("Transaction successful! Total payment: Rp%.0f (Discount: %.0f%%)\n\n", totalPay, discount * 100);

        } while (true);

        System.out.println("\n=== DAILY RECAPITULATION REPORT ===");
        System.out.println("Total Tickets Sold     : " + totalTicketsSold + " Tickets");
        System.out.printf("Total Daily Income      : Rp.%.0f\n", totalIncome);

        sc.close();

        }
    }

