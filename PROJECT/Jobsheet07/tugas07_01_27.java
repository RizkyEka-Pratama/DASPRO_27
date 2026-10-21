package PROJECT.Jobsheet07;
import java.util.Scanner;
public class tugas07_01_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hargaTiket=50000,jml,diskon=0,totalharga=0,total,totalDiskon;
        for (int i = 0; i >=0; i++) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jml = sc.nextDouble();
            if (jml>10) {
                diskon=0.15;
            } else {
                if (jml>4) {
                    diskon=0.1;
                } else {
                    if (jml<0) {
                        System.out.print("Masukkan lagi jumlah tiket: ");
                        jml=sc.nextDouble();
                    }
                }
            }
            totalharga=(hargaTiket*jml);
            totalDiskon=totalharga*diskon;
            total=totalharga-totalDiskon;
            
            int diskonAkhir =(int)totalDiskon;
            int akhir = (int)total;

            System.out.println("Diskon: "+diskonAkhir);
            System.out.println("Total: "+akhir);
        }
        sc.close();
    }
}
