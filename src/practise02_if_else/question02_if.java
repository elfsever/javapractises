package practise02_if_else;
import java.util.Scanner;
public class question02_if {
    public static void main(String[] args) {

        //Kullancıdan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayi = scan.nextInt();

        if(sayi%2==0){
            System.out.println("Cift sayı");
        }
        if(sayi%2==1){
            System.out.println("Tek sayı");
        }
        scan.close();
    }
}
