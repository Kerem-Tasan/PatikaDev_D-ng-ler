import java.util.Scanner;

public class fibinocci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Kaç elemanlı bir seri olacak:");
        int seri = input.nextInt();
      int temp=0,i=1;
        
        // 9 a kadar gider ilk for
        for (int j = 1; j <seri; j++) {
         
            int sonuc= temp + i;
            System.out.print(sonuc+" ");
           temp=i;
           i=sonuc;
        
        }
     

    }
}
