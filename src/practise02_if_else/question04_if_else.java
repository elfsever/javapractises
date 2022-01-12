package practise02_if_else;
import java.util.Scanner;

public class question04_if_else {

    public static void main(String[] args) {

        //Soru 1: Kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin
        // ve dikdörtgenin kare olup olmadıgını yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen dikdörtgenin bir kenar uzunluğunu girin");

        double kenar1 = scan.nextDouble();

        System.out.println("Lütfen dikdörtgenin diğer kenar uzunluğunu girin");

        double kenar2 = scan.nextDouble();

        if(kenar1==kenar2){
            System.out.println("Girilen ölçülere göre şekil karedir.");
        } else {
            System.out.println("Girilen ölçülere göre şekil kare değildir.");
        }

        scan.close();
    }
}
