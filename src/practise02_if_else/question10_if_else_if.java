package practise02_if_else;
import java.util.Scanner;
public class question10_if_else_if {
    public static void main(String[] args) {
        /*Kullanıcıdan maas için bir teklif isteyin
         teklif>80.000 ise kabul ediyorum
         teklif>=60.000 || teklif <=80.000 ise Konusabiliriz
         teklif<60.000 ise maalesef kabul edemem yazdirin
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen maaş teklifinizi giriniz");

        int teklif = scan.nextInt();

        if(teklif>80000){
            System.out.println("kabul ediyorum");
        }else if (teklif>60000){
            System.out.println("Konusabiliriz");
        }else {
            System.out.println("maalesef kabul edemem");
        }
        scan.close();
    }
}
