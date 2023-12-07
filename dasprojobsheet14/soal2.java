package dasprojobsheet14;

import java.util.Scanner;

public class soal2 {
    static int penjumlahanRekrusif(int n) {
        if (n == 1) {
            System.out.print("1");
            return 1;
        } else {
            int hasil = penjumlahanRekrusif(n-1)+n;
            System.out.print(" + " + n);
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;
        System.out.print("Masukkan angka: ");
        angka=sc.nextInt();
        sc.close();

        int result = penjumlahanRekrusif(angka);
        System.out.println(" = "+result);
    }
}
