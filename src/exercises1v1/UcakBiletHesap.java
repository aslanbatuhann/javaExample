package exercises1v1;

import java.util.Scanner;

public class UcakBiletHesap {
    public static void main(String[] args) {
        int mesafe, yas, yolculukTipi;
        double yasIndirimi = 0, normalTutar, indirimliTutar, gidisDonusIndirimi, toplamTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz:");
        mesafe = scanner.nextInt();
        if (mesafe <= 0) {
            System.out.println("Hatali Veri Girildi.");
        }
        System.out.println("Yasiniz:");
        yas = scanner.nextInt();
        if (yas <= 0) {
            System.out.println("Hatali Veri Girildi.");
        }
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş):");
        yolculukTipi = scanner.nextInt();
        if (yolculukTipi != 1 && yolculukTipi != 2) {
            System.out.println("Hatali Veri Girildi.");
        }
        normalTutar = mesafe * 0.10;

        if (yas < 12) {
            yasIndirimi = normalTutar * 0.50;
        } else {
            if (yas <= 24) {
                yasIndirimi = normalTutar * 0.10;
            } else {
                if (yas > 65) {
                    yasIndirimi = normalTutar * 0.30;
                } else {
                    yasIndirimi = 0;
                }
            }
        }

        indirimliTutar = normalTutar - yasIndirimi;
        if (yolculukTipi == 2) {
            gidisDonusIndirimi = indirimliTutar * 0.20;
        } else {
            gidisDonusIndirimi = 0;
        }
        toplamTutar = (indirimliTutar - gidisDonusIndirimi) * (yolculukTipi == 2 ? 2 : 1);
        System.out.printf("Toplam Tutar=.%.1f TL", toplamTutar);

    }
}
