package exercises1v1;

import java.util.Scanner;

public class TersUcgenHesap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n sayisi giriniz:");
        int n = scanner.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = ((2 * i) - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
