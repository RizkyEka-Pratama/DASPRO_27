import java.util.Scanner;
public class triangle27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkuna nilai n = ");
        int n = sc.nextInt();

        int i = 0;
        while (i<=n) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println();
        i = n;
        int k=0;
        while (k<=n) {
            int l = 0;
            while (l<n-k) {
                System.out.print("*");
                l++;
            }
            System.out.println();
            k++;
        }
        sc.close();
    }
}
