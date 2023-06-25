package exercises1v1;

import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        int dogumYili;
        String cinZodyagiBurcu = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dogum Yilinizi Giriniz :");
        dogumYili = scanner.nextInt();
        if (dogumYili % 12 == 0) {
            cinZodyagiBurcu = "Maymun";
        } else if (dogumYili % 12 == 1) {
            cinZodyagiBurcu = "Horoz";
        } else if (dogumYili % 12 == 2) {
            cinZodyagiBurcu = "Köpek";
        } else if (dogumYili % 12 == 3) {
            cinZodyagiBurcu = "Domuz";
        } else if (dogumYili % 12 == 4) {
            cinZodyagiBurcu = "Fare";
        } else if (dogumYili % 12 == 5) {
            cinZodyagiBurcu = "Öküz";
        } else if (dogumYili % 12 == 6) {
            cinZodyagiBurcu = "Kaplan";
        } else if (dogumYili % 12 == 7) {
            cinZodyagiBurcu = "Tavşan";
        } else if (dogumYili % 12 == 8) {
            cinZodyagiBurcu = "Ejderha";
        } else if (dogumYili % 12 == 9) {
            cinZodyagiBurcu = "Yılan";
        } else if (dogumYili % 12 == 10) {
            cinZodyagiBurcu = "At";
        } else if (dogumYili % 12 == 11) {
            cinZodyagiBurcu = "Koyun";
        } else {
            System.out.println("Gecersiz islem");
        }
        System.out.println("Cin Zodyagi Burcunuz :" + cinZodyagiBurcu);
    }
}
