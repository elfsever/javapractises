package practise02_if_else;
import java.util.Scanner;
public class question07_if_else {
    public static void main(String[] args) {

        //kullanıcıdan bir ucgenin 3 kenar uzunluğunu alın ve eşkenar ucgen, ikizkenar
        //ucgen veya ceşitkenar üçgen olup olmadıgını yazdırın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ücgenin kenar uzunluklarını sırayla girin(ilk kenardan sonra enter'a basın)");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar3==kenar2){
            System.out.println("Eşkenar Üçgen");
        }else if(kenar1==kenar2  || kenar3==kenar1){
            System.out.println("İkizkenar Üçgen");
        }else {
            System.out.println("Çeşitkenar Üçgen");
        }
        scan.close();
    }
}
