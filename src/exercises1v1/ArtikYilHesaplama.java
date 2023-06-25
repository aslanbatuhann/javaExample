package exercises1v1;

import java.util.Scanner;

public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yil Giriniz:");
        yil = scanner.nextInt();
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " artik yildir!");
                } else {
                    System.out.println(yil + " artik yil degildir!");
                }
            } else {
                System.out.println(yil + " artik yildir!");
            }
        } else {
            System.out.println(yil + " artik yil degildir!");
        }
    }
}
