import java.util.Scanner;
public class harmonik {
    public static void main(String[] args) {
        Scanner verial=new Scanner(System.in);
  int n;
      System.out.println("bir sayı girin");
       n=verial.nextInt();
double result=0.0;


          for(int  i=1;i<=n;i++){
              result+=(1.0/i);
             
           
          }
        
          System.out.println(result);
        }
}
