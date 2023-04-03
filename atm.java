import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        int balance = 0;
        int price;
        int right = 3;
        do {
            System.out.print("Kullanıcı adınızı girin->");
            String nick = input.nextLine();
            System.out.print("Parolanızı girin->");
            String lock = input.nextLine();
            if (nick.equals("kaladin") && lock.equals("bridge")) {
                do {
                    System.out.println("yapmak istediğiniz işlemi seçin" +
                            " 1->para çekme\n" +
                            " 2->para yatırma\n" +
                            " 3->bakiye sorgulama\n" +
                            "4->çıkış");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Çekmek istediğiniz parayı girin");
                            price = input.nextInt();
                            balance -= price;
                            break;
                        case 2:
                            System.out.println("Yatırmak istediğiniz parayı girin");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 3:
                            System.out.println("Mevcut bakiyeniz:" + balance);

                            break;

                        default:
                            break;
                    }
                } while (select != 4);
                System.out.println("Çıkış yapılıyor");
                break;

            }

            else {
                right--;
                if (right > 0) {
                    System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyin.");
                    System.out.println("Kalan hakkınız: " + right);

                } else {
                    System.out.println("Hakkınız kalmadı.Sistem kapatılıyor.Banka ile iletişime geçin");
                }
            }
        } while (right > 0);

    }
}
