import java.util.Scanner;

public class Latihan10_03_27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int totalJumlahKuadrat = 0;

        for (int i = 1; i <= n; i++) {
            int kuadrat = 0;
            for (int j = 1; j <= i; j++) {
                kuadrat += i;
            }

            totalJumlahKuadrat += kuadrat;

            System.out.print("n = " + i + " -> jumlah kuadrat = ");
            int tempSum = 0;
            for (int x = 1; x <= i; x++) {
                int kuadratX = 0;
                for (int y = 1; y <= x; y++) {
                    kuadratX += x;
                }
                tempSum += kuadratX;
                System.out.print(kuadratX);
                if (x < i) {
                    System.out.print(" + ");
                }
            }
            System.out.println(" = " + totalJumlahKuadrat);
        }
    }
}