package exercises1v1;

import java.util.Scanner;

public class MukemmelSayiPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int sayi = scanner.nextInt();
        int toplam = 0;
        if (sayi != 1) {
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }
        } else {
            System.out.println(sayi + " Mukemmel sayi degildir.");
        }
        if (sayi == toplam) {
            System.out.println(sayi + " Mukemmel sayidir.");
        } else {
            System.out.println(sayi + " Mukemmel sayi degildir.");
        }
    }
}
