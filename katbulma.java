import java.util.Scanner;

public class katbulma {
    public static void main(String[] args) {

        Scanner verial = new Scanner(System.in);

        System.out.println("Bir sınır belirleyin");
        int sinir = verial.nextInt();
        System.out.println("4 ün katları \n");
        for (int i = 1; i <= sinir; i *= 4) {
            System.out.println(i);
        }
        System.out.println("5 in katları \n");
        for (int j = 1; j <= sinir; j *= 5) {
            System.out.println(j);

        }

    }
}
