import java.util.Scanner;

public class tr_SecondsCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int secim = 1;

        while (secim == 1) {

            int girilenSaniye = -1;

            while (true) {
                System.out.print("Saniye değeri giriniz: ");

                if (input.hasNextInt()) {
                    girilenSaniye = input.nextInt();

                    if (girilenSaniye >= 0) {
                        break;
                    }
                    else {
                        System.out.println("Lütfen 0'dan büyük bir değer giriniz!: ");
                        girilenSaniye = input.nextInt();
                    }
                }
                else {
                    System.out.println("Lütfen sadece tam sayı değeri giriniz:");
                    input.next();
                }  
            }

            System.out.print(girilenSaniye + " saniye: ");

            if (girilenSaniye == 0) {
                System.out.print("0 saniye ediyor.");
                System.out.println();
            }

            int saat = girilenSaniye / 3600;
            int saattenKalanSaniye = girilenSaniye % 3600;
            int dakika = saattenKalanSaniye / 60;
            int dakikadanKalanSaniye = saattenKalanSaniye % 60;
            int kalanSaniye = dakikadanKalanSaniye;

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
            
            while (true) {
                System.out.print("1-Tekrar Hesapla\n2-Çıkış\nSeçiminiz: ");
                
                if (input.hasNextInt()) {
                    secim = input.nextInt();
                    
                    if (secim == 1 || secim == 2) {
                        break;
                    } else {
                        System.out.println("Hata: Lütfen sadece 1 veya 2 seçeneklerinden birini giriniz!\n");
                    }
                } else {
                    System.out.println("Hata: Lütfen sadece sayısal bir değer giriniz!\n");
                    input.next();
                }
            }
            if (secim == 2) {
                System.out.println("Sistemden çıkış yapılıyor...");
                System.exit(0);
            }
        }
    }    
}