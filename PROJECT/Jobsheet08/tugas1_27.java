import java.util.Scanner;
public class tugas1_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int n = sc.nextInt();
        int total=0;
        for (int i = 0; i <= n; i++) {
            int angka=1;
            for (int j = 0; j < i; j++) {
                System.out.print(angka + " ");
                angka++;
                total++;
            }
            System.out.println();
        }
        System.out.println("Total angka tercetak: " + total);
        sc.close();
    }
}
