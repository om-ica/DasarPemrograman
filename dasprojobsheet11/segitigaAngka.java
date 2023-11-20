package dasprojobsheet11;

import java.util.Scanner;

public class segitigaAngka {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int angka = 0;

        System.out.print("Masukkan angka: ");
        angka=sc.nextInt();

        for (int i = 1; i <= angka; i++) {
            for (int j = 1; j <= angka; j++) {
                if (j <= angka-i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j-(angka-i));
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
