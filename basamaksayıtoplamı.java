import java.util.Scanner;

public class basamaksayıtoplamı {
    public static void main(String[] args) {
        Scanner verial = new Scanner(System.in);
        System.out.println("bir sayı girin");
        int sayi = verial.nextInt();
        int kalan = 0;
        int toplam = 0;
        int gecici = sayi;
        int sayac = 0;
        // basamak sayısı
        for (int i = 0; i < gecici; i++) {
            gecici /= 10;
            sayac++;
            if (gecici < 0) {
                continue;
            }
        }
        gecici = sayi;
  while (gecici != 0) {
       for (int j = 0; j < sayac; j++) {// 163 1+6+3=10
                kalan = gecici % 10;
               
            }

            toplam += kalan;
             gecici /= 10;
}
            System.out.println(toplam);
    }
}
