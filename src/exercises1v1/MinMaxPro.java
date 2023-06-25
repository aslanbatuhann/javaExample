package exercises1v1;

import java.util.Scanner;

public class MinMaxPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz :");

        int sayi = scanner.nextInt();
        int maxSayi = 0;
        int minSayi = 0;

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i + " Sayiyi giriniz:");
            int n = scanner.nextInt();

            if (n < minSayi) {
                minSayi = n;
            }
            if (n > maxSayi) {
                maxSayi = n;
            }
        }
        System.out.println("En buyuk sayi:" + maxSayi);
        System.out.println("En kucuk sayi:" + minSayi);
    }
}
