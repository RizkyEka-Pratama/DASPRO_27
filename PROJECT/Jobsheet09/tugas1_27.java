package PROJECT.Jobsheet09;
import java.util.Scanner;
public class tugas1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa,total=0;
        double rata2;
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-"+ (i+1)+": ");
            nilaiMahasiswa[i]=sc.nextInt();
            total += nilaiMahasiswa[i];
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            String status = (nilaiMahasiswa[i] > 50) ? "LULUS" :  "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilaiMahasiswa[i] + " (" + status + ")");
        }
        rata2= (double) total/nilaiMahasiswa.length;
        System.out.println("Rata-rata Nilai: " + rata2);

        int tertinggi = nilaiMahasiswa[0];
        int terendah = nilaiMahasiswa[0];
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] > tertinggi) {tertinggi = nilaiMahasiswa[i];}
            if (nilaiMahasiswa[i] < terendah) {terendah = nilaiMahasiswa[i];}
        }
        System.out.println("Nilai Tertinggi: "+tertinggi);
        System.out.println("Nilai Terendah: "+ terendah);
        sc.close();
    }
}
