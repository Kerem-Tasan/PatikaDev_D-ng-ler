import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner verial = new Scanner(System.in);

        System.out.println("Kümenin eleman sayısını giriniz");
        int sayi = verial.nextInt();
        System.out.println("Kaç farklı gurup bulunduğunu yazın");
        
        int gurup = verial.nextInt();                                                                                 
                                                                                     
                                                                                                                  //Kombinasyon formülü // 
                                                                                                            //       C(n,r) = n! / (r! * (n-r)!)
        int  toplam1 = 1, toplam2 = 1;
        double sonuc = 0;
        if (sayi > gurup) {
            for (int i = 1; i <= sayi; ++i) {
                toplam1 *= i;
            }

            for (int j = 1; j <= gurup; ++j) {
                toplam2 *= j;

            }
            sonuc = toplam1 / (toplam2 * (sayi - gurup));

        } else {
            System.out.println("küme guruptan büyük olmalı.");
        }
        System.out.println(sonuc);

    }
}
