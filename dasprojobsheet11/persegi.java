package dasprojobsheet11;

import java.util.Scanner;

public class persegi {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int angka = sc.nextInt();

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < angka; j++) {
                if (i==0 || i==angka-1 || j==0 || j==angka-1) {
                    System.out.print(angka+" ");
                } else if (angka > 9) {
                    System.out.print("   ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

        sc.close();
    }
}
