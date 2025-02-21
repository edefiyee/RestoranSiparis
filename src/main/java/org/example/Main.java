package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //ÖDEV5
        Scanner scanner = new Scanner(System.in);
        int secim;
        double toplamHesap = 0;
        do {
            System.out.println("Restoran Menüsü ");
            System.out.println("1 - baklava 120 TL");
            System.out.println("2 - Pilav (50 TL)");
            System.out.println("3 - Çorba (40 TL)");
            System.out.println("0 - Siparişi tamamla");
            System.out.print("Lütfen bir yemek seçin: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş ");
                scanner.next();
            }

            secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    toplamHesap += 120;
                    System.out.println("baklava eklendi. Toplam:" + toplamHesap + " TL");
                    break;
                case 2:
                    toplamHesap += 50;
                    System.out.println("Pilav eklendi. Toplam: " + toplamHesap + " TL");
                    break;
                case 3:
                    toplamHesap += 40;
                    System.out.println("Çorba eklendi. Toplam: " + toplamHesap + " TL");
                    break;

                case 0:
                    System.out.println("Siparişiniz tamamlandı.");
                    break;
                default:
                    System.out.println("Tekrar deneyin... ");
            }
        } while (secim != 0);
        System.out.println("Toplam hesap: " + toplamHesap + " TL. Afiyet olsun!");

    }
}