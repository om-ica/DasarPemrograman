package dasprojobsheet5;

import java.util.Scanner;

public class PemilihanPercobaan115 {
    public static void main(String[] args) {

        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka=input15.nextInt();

        String hasil=angka % 2==0 ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println("Jadi hasilnya adalah " + hasil);

        input15.close();
    }
}
