import java.util.Scanner;

public class asalsayi {
    public static void main(String[] args) {
        Scanner verial = new Scanner(System.in);
        
        for (int j = 2; j <= 100; j++) {int sayac = 0;
            for (int i = 1; i <= j; i++) {
                
                if (j % i == 0) {
                    sayac++;
                }
            }
                if (sayac == 2) {
                    System.out.println(j + " asaldır");
                } 
                

            

        }
    }
}
