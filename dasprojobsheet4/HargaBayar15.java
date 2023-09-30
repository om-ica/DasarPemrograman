package dasprojobsheet4;

import java.util.Scanner;

public class HargaBayar15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int harga, jumlah;
        double diskon, total, bayar, jmldis;

        System.out.println("Masukkan Merk Buku");
        String merkBuku=input.nextLine();
        System.out.println("Masukkan jumlah halaman buku");
        String jmlHalBuku=input.nextLine();
        System.out.println("Masukkan harga barang yang dibeli ");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah jumlah barang yang dibeli ");
        jumlah=input.nextInt();
        System.out.println("Masukkan diskon");
        diskon=input.nextDouble();

        total=harga*jumlah;
        jmldis=total*diskon;
        bayar=total-jmldis;

        System.out.println("Diskon yang anda dapatkan adalah " + jmldis);
        System.out.println("Jumlah yang harus dibayar adakah " + bayar);

        input.close();
    }
}
