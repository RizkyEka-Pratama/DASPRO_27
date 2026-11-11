package PROJECT.Jobsheet09;

import java.util.Scanner;

public class ArrayNilai27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lulus=0; int tidakLulus=0;
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiAkhir.length; i++) {
            String status = (nilaiAkhir[i] > 70) ? "LULUS" :  "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilaiAkhir[i] + " (" + status + ")");
            if (nilaiAkhir[i] > 70) {
                lulus++;
            }else{
                tidakLulus++;
            }
        }
        System.out.println("Jumlah Mahasiswa yang lulus: "+lulus);
        System.out.println("Jumlah Mahasiswa yang tidak lulus: "+tidakLulus);

        // for (int i = 0; i < nilaiAkhir.length; i++) {
        //     String status = "LULUS";
        //     if (nilaiAkhir[i]>70) {
        //         System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilaiAkhir[i] + " (" + status + ")");
        //     }
        // }
        input.close();
    }
}
