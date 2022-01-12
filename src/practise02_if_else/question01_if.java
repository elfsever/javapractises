package practise02_if_else;
import java.util.Scanner;
public class question01_if {
    public static void main(String[] args) {
        /*Kullanıcıdan gün isimlerinden birinin ilk harfini isteyip
          o harfle baslayan günleri yazdırın. */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gün isimlerinden birinin ilk harfini giriniz");

        char ilkHarf=scan.next().toUpperCase().charAt(0);

        if (ilkHarf=='P'){
            System.out.println("Pazar, Pazartesi veya Persembe");
        }
        if (ilkHarf=='S'){
            System.out.println("Salı");
        }
        if (ilkHarf=='Ç'){
            System.out.println("Çarsamba");
        }
        if (ilkHarf=='C'){
            System.out.println("Cuma veya Cumartesi");
        }
        if (ilkHarf!='C' &&ilkHarf!='P' && ilkHarf!='Ç' && ilkHarf!='S'){
            System.out.println("Gecersiz harf girdiniz.");
        }
        scan.close();
    }
}
