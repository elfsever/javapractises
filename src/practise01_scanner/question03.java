package practise01_scanner;
import java.util.Scanner;
public class question03 {
    public static void main(String[] args) {
        /*Kullanıcıdan 3 basamakli bir syi alp rakamları
           toplamını yazdıran program yazınız*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamaklı bir sayı giriniz");
        int sayi= scan.nextInt();
        int rakamlartoplami=0;
        int rakam = sayi%10;     //sayi 123 olsun bu islem birler basamagini verir
        rakamlartoplami+=rakam;   //rakamlar toplamı 3 oldu
                                 //birler basamagi 3 aldik artik ondan kurtulabiliriz
        sayi/=10;               //12,3 oldu int old. icin 12 alır
        rakam=sayi%10;
        rakamlartoplami+=rakam;
        sayi/=10;               //2 den kurtulalım
        rakamlartoplami+=sayi;

        System.out.println("Girilem sayının rakamları toplamı: "+ rakamlartoplami);
        scan.close();





    }

}
