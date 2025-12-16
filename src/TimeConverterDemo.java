/*
 * PRAKTIKUM 02 "IN234 Paradigma Pemrograman" - SOAL 1
 * Nama Program : TimeConverterDemo
 * Deskripsi    : Program menjalankan class 'TimeConverter' untuk mengubah detik yang diinput menjadi bentuk timestamp.
 * Penulis      : Miracle Steven Gerrald
 * NRP          : 2472019
*/

import java.util.Scanner;

public class TimeConverterDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimeConverter timeConverter = new TimeConverter();

        System.out.println("============================================");
        System.out.println("             TIME CONVERTER APP             ");
        System.out.println("============================================");
        System.out.print("Input time (second, 0 to exit): ");
        int second = sc.nextInt();
        sc.nextLine();
        timeConverter.setSecond(second);
        System.out.printf("Converted Time: %s", timeConverter.showTime());
    }
}
