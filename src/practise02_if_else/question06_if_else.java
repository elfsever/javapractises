package practise02_if_else;
import java.util.Scanner;
public class question06_if_else {
    public static void main(String[] args) {
        //Kullanıcıya yaşını sorun 65'ten küçükse emekli olamazsin,
        //65'eşit veya büyükse emekli olabilirsin yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas= scan.nextInt();

        if (yas<65){
            System.out.println("Emekli olamazsınız.");
        }else{
            System.out.println("Emekli olabilirsiniz.");
        }
        scan.close();

    }
}
