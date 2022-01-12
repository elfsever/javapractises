package practise02_if_else;
import java.util.Scanner;
public class question09_if_else_if {
    public static void main(String[] args) {

        /*Kullanıcıdan 100 üzerinden not isteyin
          notu harf sistemine cevirip yazdırın
          not<50 ise "D"
          not>=50 ve not<60 ise "C"
          not>=60 ve not<80 ise "B"
          not>=80 ise "A"
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 100 üzerinden notunuzu giriniz");
        double not= scan.nextDouble();
        if (not<0 || not>100){
            System.out.println("Lutfen gecerli bir not giriniz");
        }else if (not<50){
            System.out.println("Harf Notu: D");
        }else if ( not<60){
            System.out.println("Harf Notu: C");
        }else if ( not<80){
            System.out.println("Harf Notu: B");
        }else {
            System.out.println("Harf Notu: A");
        }
        scan.close();

    }
}
