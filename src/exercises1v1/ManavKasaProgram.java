package exercises1v1;

import java.util.Scanner;

public class ManavKasaProgram {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00,
                armutKilo, elmaKilo, patlicanKilo, domatesKilo, muzKilo, tutar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo :");
        armutKilo = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo :");
        elmaKilo = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo :");
        domatesKilo = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo :");
        muzKilo = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo :");
        patlicanKilo = scanner.nextDouble();
        tutar = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
        System.out.println("Toplam Tutar :" + tutar);
    }
}
