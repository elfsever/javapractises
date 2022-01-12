package practise02_if_else;
import java.util.Scanner;
public class question05_if_else {
    public static void main(String[] args) {
        //Kullanıcıdan bir karakter girmesini isteyin ve harf olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");

        char karakter=scan.next().toUpperCase().charAt(0);

        if(karakter>='A' && karakter<='Z'){
            System.out.println("Girdiginiz karakter bir harftir.");

        }else{
            System.out.println("Girdiginiz karakter bir harf degildir.");
        }
        scan.close();
    }
}
