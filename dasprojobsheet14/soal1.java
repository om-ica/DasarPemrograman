package dasprojobsheet14;

import java.util.Scanner;

public class soal1 {
    static int hitungRekrusif(int n) {
        if (n == 0) {
            System.out.print(0 + " = ");
            return 0;
        } else {
            System.out.print(n + " - ");
            return (hitungRekrusif(n-1));
        }
    }

    static int hitungIteratif(int n) {
        int hitung=n;
        for (int i = 0; i <= n; i++) {
            hitung = n-i;
            if (i <= n) {
                System.out.print(hitung+" - ");
            } 
        }
        return hitung;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        System.out.print("Masukkan angka: ");
        angka=sc.nextInt();
        sc.close();

        System.out.println("Fungsi Rekrusif");
        System.out.println(hitungRekrusif(angka));

        System.out.println("\nFungsi Iteratif");
        int hasil = hitungIteratif(angka);
        System.out.print(" = " + hasil);


    }
}
