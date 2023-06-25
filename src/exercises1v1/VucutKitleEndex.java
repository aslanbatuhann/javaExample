package exercises1v1;

import java.util.Scanner;

public class VucutKitleEndex {
    public static void main(String[] args) {
        double vki, boy, kilo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu giriniz :");
        boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = scanner.nextDouble();
        vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz :" + vki);
    }
}
