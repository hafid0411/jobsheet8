import java.util.Scanner;

public class CinemaTickets21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int TICKET_PRICE = 50000;
        int totalTicketsSold = 0;
        double totalSalesAmount = 0;
        int tickets;
        String answer;

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik angka negatif untuk keluar/invalid): ");
            tickets = sc.nextInt();

            if (tickets < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan ulang.\n");
                continue;
            }

            if (tickets == 0) {
                System.out.print("Apakah penjualan hari ini selesai? (y/n): ");
                answer = sc.next();
                if (answer.equalsIgnoreCase("y")) {
                    break;
                } else {
                    continue;
                }
            }

            double discount = 0;
            if (tickets > 10) {
                discount = 0.15; // Diskon 15%
            } else if (tickets > 4) {
                discount = 0.10; // Diskon 10%
            }

            double totalPrice = tickets * TICKET_PRICE * (1 - discount);
            totalTicketsSold += tickets;
            totalSalesAmount += totalPrice;

            System.out.println("Total harga transaksi ini: Rp " + (long) totalPrice);
            System.out.println("----------------------------------------");

        } while (true);

        System.out.println("\n===== REKAP PENJUALAN TIKET HARI INI =====");
        System.out.println("Total tiket terjual  : " + totalTicketsSold);
        System.out.println("Total pendapatan hari ini: Rp " + (long) totalSalesAmount);

        sc.close();
    }
}