import java.util.Scanner;
public class tugas5_2_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih kode: ");
        int antrian = sc.nextInt();

        switch (antrian) {
            case 1:
                System.out.println("Layanan: Legalisir Ijazah");
                System.out.println("Loket: A");
                break;
            case 2:
                System.out.println("Layanan: Surat Keterangan Aktif Kuliah");
                System.out.println("Loket: B");
                break;
            case 3:
                System.out.println("Layanan: Pembayaran UKT");
                System.out.println("Loket: C");
                break;
            case 4:
                System.out.println("Layanan: Pengajuan Cuti Akademik");
                System.out.println("Loket: D");
                break;
            default:
                System.out.println("Tujuan tidak tersedia");
                break;
        }
    }
}
