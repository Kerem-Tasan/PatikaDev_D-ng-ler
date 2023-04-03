import java.util.Scanner;

public class mukemmelsayi {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        // 100 e kadar olan mükemmel sayılar

        for (int i = 1; i < 101; i++) {
            int toplam = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    
                        toplam += j;

                    if (toplam == i) {
                        System.out.println(toplam + " mükemmeldir");
                    }
                }
                // sdsd
            }

        }
        
}
}