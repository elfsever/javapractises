package practise02_if_else;
import java.util.Scanner;
public class question08_if_else_if {
    public static void main(String[] args) {
        //Kullanıcıdan iki sayı isteyin sayıların ikisi de;
        //pozitif ise toplamını yazdırın
        //negatif ise carpımını yazdırın
        //ikisi de faklı işarete sahipse işlem yapamazsınız yazdırın
        //sıfıra eşit olan sayı varsa sıfır yutan elemandır yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki sayı yazınız(ilk sayıdan sonra enter'a basınız)");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();

        if (sayi1>=0 && sayi2>=0){
            System.out.println("sayıların toplamı: " +(sayi1+sayi2));
        }else if(sayi1<0 && sayi2<0){
            System.out.println("sayıların çarpımı: "+ (sayi1*sayi2));
        }else if (sayi1*sayi2<0){
            System.out.println("farklı işaretlerle işlem yapamazsnız");
        }else{
            System.out.println("Sıfır carpmaya göre yutan elemandır");
        }
        scan.close();
    }
}
