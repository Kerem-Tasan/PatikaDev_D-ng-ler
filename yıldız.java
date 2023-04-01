import java.util.Scanner;

public class yıldız {
  public static void main(String[] args) {
    Scanner verial = new Scanner(System.in);
    
    System.out.print("basamak sayısı girin");
    int n = verial.nextInt();

    for (int i = 1; i <= n; i++) {
      // boşluk

      for (int k = 1; k <= (n - i); k++) {
        System.out.print(" ");

      } // yıldız
      for (int j= 1; j <= (2 * i) - 1; j++) {
        System.out.print("*");
      
      }
      System.out.println();
     
    }
    
    
  for (int a = n - 1; a >= 0; a--) {
      for (int j = 1; j <= (n - a); j++) {
          System.out.print(" ");
      }
      for (int b = 1; b <= (2 * a) - 1; b++) {
          System.out.print("*");
      }
      System.out.println();
  }
  }
}

/*
     * 
    ***
   ***** 
  *******
 *********
  *******
   *****
    ***
     *
       */