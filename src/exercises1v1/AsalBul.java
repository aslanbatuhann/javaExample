package exercises1v1;

import java.util.Scanner;

public class AsalBul {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayı Gir: ");
        int n = input.nextInt();

        if (isBool(n)) {
            System.out.println(n + " sayısı asal");
        } else {
            System.out.println(n + " sayısı asal değildir");
        }
    }

    static boolean isBool(int n) {
        if (n <= 1) {
            return false;
        }
        if (n % 2 == 0) {
            return false;
        }
        return isBool(n, 3);
    }

    static boolean isBool(int n, int i) {
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isBool(n, i + 2);
    }
}
