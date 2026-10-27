public class latihan10_02_27 {
    public static void main(String[] args) {
        int baris = 5;
        char huruf = 'a';

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < baris - 1 - i; j++) {
                System.out.print(" ");
            }

            int jumlahKarakter = (2 * i) + 1;
            for (int k = 0; k < jumlahKarakter; k++) {
                System.out.print(huruf);
                huruf++; 
            }

            System.out.println();
        }
    }
}