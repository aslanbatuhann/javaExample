package exercises1v1;

import java.util.Scanner;

public class DeseneGoreMetot {
    static void figures(int Sayi1) {
        System.out.print(Sayi1 + " ");
        if (Sayi1 <= 0) {
            return;
        }
        figures(Sayi1 - 5);
        System.out.print(Sayi1 + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("N sayı : ");
        int n = input.nextInt();
        System.out.print("Çıktı : ");

        figures(n);
    }
}
