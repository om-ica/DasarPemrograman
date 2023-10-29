package dasprojobsheet9;

import java.util.Scanner;

public class Bulan {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        int angka;

        System.out.println("Masukkan angka 1-12");
        
        for (int i = 0; i < bulan.length; i++) {
            System.out.print("\nMasukkan angka: ");
            angka=sc.nextInt();

            System.out.println("Angka ke-" + angka + " dengan bulan " + bulan[i]);
        }

        sc.close();
    }
}
