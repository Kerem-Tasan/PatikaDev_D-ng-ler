import java.net.URLClassLoader;
import java.util.Scanner;

public class teksayi {
  public static void main(String[] args) {
    Scanner src = new Scanner(System.in);
    int sayi;
    int toplam = 0;

    do {// tek girene kadar devam ettiriyor
      do {
        System.out.println("Bir sayı giriniz =>");
        sayi = src.nextInt();
        toplam += sayi;
        System.out.println(toplam);
      } while (sayi % 4 == 0);
      if (sayi % 4 != 0) { // 4 ün katı olmayanı çıkarıyor
        toplam = toplam - sayi;
        System.out.println(toplam);
      } else if (sayi % 2 == 1) {// tek sayıyı yazdırıyor
        System.out.println("Girdiğiniz tek sayı =>" + sayi + "\ngirdiğiniz çift sayıların toplamı=> " + toplam);

      }

      else {
        return;
      }
    } while (sayi % 2 == 0);

  }
}