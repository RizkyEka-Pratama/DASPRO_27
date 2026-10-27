import java.util.Scanner;

public class latihan10_04_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah produk: ");
        int jmlProduk = sc.nextInt();
        System.out.print("Masukkan jumlah hari pencatatan: ");
        int jmlHari = sc.nextInt();

        int totalSemuaProduk = 0;
        int p = 1;

        while (p <= jmlProduk) {
            System.out.println("\n--- Data Penjualan Produk " + p + " ---");
            int totalProduk = 0;

            for (int h = 1; h <= jmlHari; h++) {
                int jumlahTerjual;
                
                do {
                    System.out.print("  Masukkan jumlah terjual Hari ke-" + h + ": ");
                    jumlahTerjual = sc.nextInt();
                    if (jumlahTerjual < 0) {
                        System.out.println("  [Peringatan] Jumlah terjual tidak boleh negatif! Masukkan ulang.");
                    }
                } while (jumlahTerjual < 0);

                totalProduk += jumlahTerjual;
            }

            double rataRata = (double) totalProduk / jmlHari;

            System.out.println("-> Total penjualan Produk " + p + " = " + totalProduk);
            System.out.printf("-> Rata-rata harian Produk %d = %.2f\n", p, rataRata);

            totalSemuaProduk += totalProduk;
            p++;
        }

        System.out.println("\n========================================");
        System.out.println("TOTAL KESELURUHAN SELURUH PRODUK = " + totalSemuaProduk);
    }
}