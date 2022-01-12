package practise01_scanner;
import java.util.Scanner;
public class question02_scanner {
    public static void main(String[] args) {
        /*Kullanıcıdan yaricap isteyin ve cemberin cevresini ve alanını yazdırın*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen çemberin yarıçapını giriniz");
        double yaricap = scan.nextDouble();
        double cevre = 2*Math.PI*yaricap;
        double alan = Math.PI*yaricap*yaricap;
        System.out.println("Cevre:" + cevre);
        System.out.println("Alan: " + alan);

        scan.close();

        }
    }

