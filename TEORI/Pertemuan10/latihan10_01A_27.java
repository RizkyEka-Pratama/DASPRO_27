public class latihan10_01A_27 {
    public static void main(String[] args) {
        int n = 10;

        System.out.println("\n=== POLA A (Segitiga Siku-Siku Terbalik) ===");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}