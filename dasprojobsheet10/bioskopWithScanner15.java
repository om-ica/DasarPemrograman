package dasprojobsheet10;

import java.util.Scanner;

public class bioskopWithScanner15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next, konfirmasi="error";
        String[][] penonton = new String[4][2];

        for (int i = 0; i < penonton.length; i++) {
            for (int j = 0; j < penonton[i].length; j++) {
                penonton[i][j] = "***";
            }
        }
        
        while (true) {

            System.out.println("\n------Daftar Menu-----");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");

            System.out.print("   Pilih menu ke: ");
            konfirmasi=input.nextLine();

            if (konfirmasi.equals("1")) {
                while (true) {
                System.out.print("\nMasukkan nama\t: ");
                nama = input.nextLine();
                System.out.print("Masukkan baris\t: ");
                baris = input.nextInt();
                System.out.print("Masukkan kolom\t: ");
                kolom = input.nextInt();
                input.nextLine();

                if (penonton[baris-1][kolom-1]!="***") {
                    System.out.println("Tempat sudah terisi");
                    continue;
                }
                if (baris > 4) {
                    if (kolom > 2) {
                        System.out.println("Kursi tidak tersedia");
                    }
                    continue;
                }

                

                penonton[baris-1][kolom-1] = nama;

                System.out.print("Input penonton lainnya? (y/n): ");
                next = input.nextLine();

                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }
            
            }
            
            if (konfirmasi.equals("2")) {
                System.out.println("-------------------------------------------------");

                System.out.printf("%s \t %s \n", penonton[0][0], penonton[0][1]);
                System.out.printf("%s \t %s \n", penonton[1][0], penonton[1][1]);
                System.out.printf("%s \t %s \n", penonton[2][0], penonton[2][1]);
                System.out.printf("%s \t %s \n", penonton[3][0], penonton[3][1]);
            }

            if (konfirmasi.equals("3")) {
               break; 
            }
            
        }

        input.close();
    }
}
