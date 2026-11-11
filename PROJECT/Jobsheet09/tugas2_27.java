package PROJECT.Jobsheet09;
import java.util.Scanner;
public class tugas2_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", 
        "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};
        int total = 0;
        System.out.println("========== MENU ==========");
        System.out.printf("%-20s : %s%n", menu[0], harga[0]);
        System.out.printf("%-20s : %s%n", menu[1], harga[1]);
        System.out.printf("%-20s : %s%n", menu[2], harga[2]);
        System.out.printf("%-20s : %s%n", menu[3], harga[3]);
        System.out.printf("%-20s : %s%n", menu[4], harga[4]);
        System.out.printf("%-20s : %s%n", menu[5], harga[5]);
        System.out.printf("%-20s : %s%n", menu[6], harga[6]);

        System.out.print("Masukkan Jumlah pesanan anda: ");
        int jumlahPesanan=sc.nextInt();

        sc.nextLine();
        
        String[] pesanan= new String[jumlahPesanan];
        boolean ditemukan = false;

        for (int i = 0; i < pesanan.length;) {
            System.out.print("Masukkan Pesaanan ke-" + (i+1) + ": ");
            pesanan[i]=sc.nextLine();

            for (int j = 0; j < menu.length; j++) {
                if (pesanan[i].equalsIgnoreCase(menu[j])) {
                    System.out.println("Pesanan: " + pesanan[i]);
                    System.out.println("harga: "+harga[j]);
                    ditemukan =true;
                    total += harga[j];
                    i++;
                    break;
                }
            }
            if (!ditemukan) {
                System.out.println("Pesanan Tidak Ada");
            }
        }
        System.out.println("===================");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.println("Pesanan ke-" + (i+1) + ": " + pesanan[i]);
            for (int j = 0; j < menu.length; j++) {
                if (pesanan[i].equalsIgnoreCase(menu[j])) {
                    System.out.println("Harga: " + harga[j]);
                }
            }
            
        }
        System.out.println("Total Biaya: " + total);
        sc.close();
    }
}
