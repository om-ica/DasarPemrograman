package dasprojobsheet4;

import java.util.Scanner;

public class Gaji15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jmlMasuk, jmlTdkMasuk, TotGaji;
        int gaji, potGaji;

        System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
        jmlMasuk=input.nextInt();
        System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
        jmlTdkMasuk=input.nextInt();

        System.out.println("Gaji: ");
        gaji=input.nextInt();
        System.out.println("Potongan gaji: ");
        potGaji=input.nextInt();

        TotGaji=(jmlMasuk*gaji)-(jmlTdkMasuk*potGaji);

        System.out.println("Gaji yang anda terima adalah " + TotGaji);

        input.close();
    }
}
