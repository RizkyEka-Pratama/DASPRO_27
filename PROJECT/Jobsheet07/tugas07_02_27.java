package PROJECT.Jobsheet07;
import java.util.Scanner;
public class tugas07_02_27 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    int jenis, durasi,total=0;

    for (int i = 0; i >=0; i++) {
        System.out.println("Masukkan jenis kendaraan");
        System.out.println("1. mobil");
        System.out.println("2. motor");
        System.out.println("0. keluar");
        System.out.print("Masukkan dalam angka: ");
        jenis=sc.nextInt();

        if (jenis==1||jenis==2) {
            System.out.print("Masukkan durasi parkir: ");
            durasi=sc.nextInt();
            if (jenis==1) {
                total+=durasi*3000;
            } else {
                total+=durasi*2000;
            }
        } else {
            if (jenis!=0) {
                continue;
            }else{
                break;
            }
        }
        }
        System.out.println("Total: "+total);
        sc.close();
    }
    }