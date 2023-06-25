package exercises1v1;

import java.util.Scanner;

public class UsHesPro {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        int a = input.nextInt();
        System.out.println("Üs olacak sayı: ");
        int b = input.nextInt();

        int total = 1;

        for (int i = 0; i < b; i++) {
            total *= a;
        }

        System.out.println("Sonuc: " + total);
    }
}
