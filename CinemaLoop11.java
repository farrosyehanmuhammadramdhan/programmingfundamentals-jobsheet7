import java.util.Scanner;;

public class CinemaLoop11 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final int ticketPrice = 50000;
            int totalTickets = 0;
            double totalSales = 0;
            double discount = 0;
            double totalPrice;
            double totalPay;

            while (true) {
                System.out.print("Enter the number of tickets purchased (type 0 to finish): ");
                totalTickets = sc.nextInt();

                if (totalTickets < 0) {
                    System.out.println("The number of tickets is invalid (it cannot be negative). Please re-enter\n!");
                    continue;
                }

                if (totalTickets == 0) {
                    break;
                }

                totalPrice = totalTickets * ticketPrice;

                if (totalTickets > 10) {
                    discount = 0.15;
                } else if (totalTickets > 4) {
                    discount = 0.10;
                }

                totalPay = totalPrice - (totalPrice * discount);

                totalTickets += totalTickets;
                totalSales += totalPay;
                
                System.out.println("Discount: " + (int)(discount * 100) + "%");
                System.out.println("Total payment for this transaction: Rp. " + (long)totalPay);
                System.out.println("----------------------------------------------------");

                System.out.println("Total tickets sold today : " + totalTickets + " tickets");
                System.out.println("Total revenue for today  : Rp " + (long)totalSales);

            }
        }
    }
}
