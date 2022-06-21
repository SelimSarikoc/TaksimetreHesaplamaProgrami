import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        int km, acilis = 10;
        double ucret = 2.20;

        Scanner sonuc = new Scanner(System.in);

        System.out.print("Km Giriniz: ");
        km = sonuc.nextInt();

        ucret = acilis + (km * 2.20);
        System.out.println("Tutar:" + ucret);

        ucret = (ucret < 20) ? 20 : ucret;
        System.out.println("Genel Toplam: " + ucret);



    }

}
