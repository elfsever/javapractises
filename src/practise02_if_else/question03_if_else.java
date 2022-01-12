package practise02_if_else;
import java.util.Scanner;
public class question03_if_else {
    public static void main(String[] args) {
        //Kullanıcıdan gün ismi isteyin ve haftaici veya hafta sonu old yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen haftanın günlerinden birinin ismini yazınız");
        String gun = scan.next().toUpperCase();

        if(gun.equals("PAZAR") || gun.equals("CUMARTESİ") ){
            System.out.println("Hafta sonu");
        }
        if (gun.equals("PAZARTESİ") || gun.equals("SALI") || gun.equals("ÇARŞAMBA") ||
                gun.equals("PERŞEMBE") || gun.equals("CUMA") ){
            System.out.println("Hafta içi");
        } else {
            System.out.println("Gecersiz kelime girdiniz");
        }

        scan.close();
    }
}
