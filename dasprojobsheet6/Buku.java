package dasprojobsheet6;

import java.util.Scanner;

public class Buku {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String jnsBuku;
        int jmlBuku; 
        double hargaBuku, diskon = 0;

        System.out.print("Jenis Buku (kamus/novel/lainnya)\t: ");
        jnsBuku = input.nextLine();
        System.out.print("Harga buku\t\t\t\t: ");
        hargaBuku = input.nextDouble();
        System.out.print("Jumlah Buku\t\t\t\t: ");
        jmlBuku = input.nextInt();

        if (jnsBuku.equalsIgnoreCase("Kamus")) {
            if (jmlBuku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.10;
            }
        } else if (jnsBuku.equalsIgnoreCase("Novel")) {
            if (jmlBuku > 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else if (!jnsBuku.equalsIgnoreCase("Kamus") && !jnsBuku.equalsIgnoreCase("Novel")) {
            if (jmlBuku > 3) {
                diskon = 0.5;
            } 
        }

        double jmlDiskon = hargaBuku * diskon * jmlBuku;
        double ttlHarga = (hargaBuku * jmlBuku) - jmlDiskon;

        System.out.println("\nJumlah diskon " + (diskon * 100) + "%");
        System.out.println("Total harga " + ttlHarga);

        input.close();
    }
}
