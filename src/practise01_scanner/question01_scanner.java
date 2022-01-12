package practise01_scanner;
import java.util.Scanner;

public class question01_scanner {
    public static void main(String[] args) {

        /*Kullanıcıdan isim ve soyismini ayrı ayrı isteyip girilen verileri yan
        yana yazdırın.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();
        System.out.println("Lütfen isminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println(isim+ " " + soyisim);
        scan.close();
    }

}
