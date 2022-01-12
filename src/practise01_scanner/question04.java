package practise01_scanner;

import java.util.Scanner;

public class question04 {
    public static void main(String[] args) {
        /*Kullanıcıdan 4 basamakli bir syi alp rakamları
           toplamını yazdıran program yazınız*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamaklı bir sayı giriniz");
        int sayi= scan.nextInt();

        int rakamlartoplami=0;
        int rakam = sayi%10;
        rakamlartoplami+=rakam;
        sayi/=10;
        //bu işlem basamak sayısı kadar tekrar eder

        rakam=sayi%10;
        rakamlartoplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlartoplami+=rakam;
        sayi/=10;

        rakam=sayi%10;
        rakamlartoplami+=rakam;
        sayi/=10;

        rakamlartoplami+=sayi;

        System.out.println("Girilem sayının rakamları toplamı: "+ rakamlartoplami);
        scan.close();





    }

}
