import java.util.Scanner;
public class uslussayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
   
         System.out.println("taban giriniz");
         int taban=input.nextInt();

         System.out.println("kuvvet giriniz");
         int kuvvet=input.nextInt();

for(int i=1;i<kuvvet;i++){
taban*=taban;
}
System.out.println(taban);

    }
}
