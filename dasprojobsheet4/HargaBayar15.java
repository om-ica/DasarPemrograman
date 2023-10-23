package dasprojobsheet4;

import java.util.Scanner;

public class HargaBayar15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int harga, jumlah;
        double diskon, total, bayar, jmldis;

        System.out.print("Masukkan Merk Buku\t\t\t\t: ");
        String merkBuku=input.nextLine();
        System.out.print("Masukkan jumlah halaman buku\t\t\t: ");
        String jmlHalBuku=input.nextLine();
        System.out.print("Masukkan harga barang yang dibeli\t\t: Rp ");
        harga=input.nextInt();
        System.out.print("Masukkan jumlah barang yang dibeli\t\t: ");
        jumlah=input.nextInt();
        System.out.print("Masukkan diskon\t\t\t\t\t: ");
        diskon=input.nextDouble();

        total=harga*jumlah;
        jmldis=total*diskon;
        bayar=total-jmldis;

        System.out.println("\nDiskon yang anda dapatkan adalah " + jmldis);
        System.out.println("Jumlah yang harus dibayar adalah " + bayar);

        input.close();
    }
}
