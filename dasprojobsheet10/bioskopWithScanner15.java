package dasprojobsheet10;

import java.util.Scanner;

public class bioskopWithScanner15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.print("Masukkan nama\t: ");
            nama = input.nextLine();
            System.out.print("Masukkan baris\t: ");
            baris = input.nextInt();
            System.out.print("Masukkan kolom\t: ");
            kolom = input.nextInt();
            input.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        input.close();
    }
}
