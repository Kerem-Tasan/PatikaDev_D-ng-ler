import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 0;
        System.out.print("Kaç adet sayı girilicek:");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println("Bir sayı girin:");
            int a = input.nextInt();
            if (i == 0) {
                max = a;
                min = a;
            }
            if (a > max) {
                max = a;

            }
            if (a < min) {
                min = a;

            }

        }
        System.out.print("En büyük sayı " + max);
        System.out.print("\nEn küçük sayı " + min);
    }
}
