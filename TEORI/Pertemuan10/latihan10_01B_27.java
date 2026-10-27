public class latihan10_01B_27 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("=== POLA B (Segitiga Rata Kanan) ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}