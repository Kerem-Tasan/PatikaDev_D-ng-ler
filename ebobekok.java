import java.util.Scanner;

public class ebobekok {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);

        // ebob ekok bulma
        System.out.print("Birinci sayıyı girin:");
        int sayi1 = src.nextInt();
        System.out.print("İkinci sayıyı girin:");
        int sayi2 = src.nextInt();
        int ebob = 1;
        int j = 1;
        while (j < sayi1 * sayi2) { // ebob

            if (sayi1 % j == 0 && sayi2 % j == 0) {
                ebob = j;
            }
            j++;
        }
        System.out.print("ebob:" + ebob + "\n");

        int ekok = (sayi1 * sayi2) / ebob; // ekok

        System.out.println("ekok: " + ekok);

    }
}
