package dasprojobsheet11;

import java.util.Scanner;

public class segitigaBintang {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int angka = 0;

        System.out.print("Masukkan angka: ");
        angka=sc.nextInt();

        for (int i = 1; i <= angka; i++) {
            for (int j = i; j <= angka; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
