import java.util.Scanner;

public class tr_SecondsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secim = 1;

        while (secim == 1) {

            System.out.print("Saniye değeri giriniz: ");
            int girilenSaniye = input.nextInt();

            while (girilenSaniye < 0) {
                System.out.print("Lütfen 0'dan büyük bir değer giriniz!\n: ");
                girilenSaniye = input.nextInt();
            }
        
            int saat = girilenSaniye / 3600;
            int saattenKalanSaniye = girilenSaniye % 3600;
            int dakika = saattenKalanSaniye / 60;
            int dakikadanKalanSaniye = saattenKalanSaniye % 60;
            int kalanSaniye = dakikadanKalanSaniye;

            System.out.print(girilenSaniye + " saniye: ");

            if (girilenSaniye == 0) {
                System.out.print("0 saniye ediyor.");
                System.out.println();
            }
            if (saat > 0) {
                System.out.print(saat + " saat ");
            }
            if (dakika > 0) {
                System.out.print(dakika + " dakika "); 
            }
            if (kalanSaniye > 0) {
                System.out.print(kalanSaniye + " saniye ");
            }

            System.out.print("ediyor.");
            System.out.println();
            System.out.print("1-Tekrar Hesapla\n2-Çıkış\n: ");
            secim = input.nextInt();
            
            if (secim == 2) {
                System.out.println("Sistemden çıkış yapılıyor...");
                System.exit(0);
            }
        }
    }    
}