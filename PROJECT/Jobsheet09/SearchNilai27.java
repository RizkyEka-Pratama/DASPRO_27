package PROJECT.Jobsheet09;
import java.util.Scanner;
public class SearchNilai27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key, jumlahNilai;

        System.out.print("Masukkan jumlah Nilai: ");
        jumlahNilai = sc.nextInt();
        
        int[] nilai = new int[jumlahNilai];
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan Nilai ke-" + (i+1)+ ": ");
            nilai[i]=sc.nextInt();
        }

        System.out.print("Masukkan nilai yang dicari: ");
        key = sc.nextInt();
        boolean ditemukan = false;

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] == key) {
                System.out.println(("Nilai " + key + " ditemukan pada indeks ke-" + i));
                ditemukan = true;
                break;
            }
            if (!ditemukan) {
                System.out.println("Nilai " + key + " tidak ditemukan.");
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai "+ key+ " yang dicari tidak ditemukan dalam arrays");
        }
        sc.close();
    }
}
