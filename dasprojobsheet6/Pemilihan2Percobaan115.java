package dasprojobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan115 {
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        int tahun;

        System.out.print("Tahun: ");
        tahun=input15.nextInt();

        if (tahun % 4 == 0) {
            if (tahun % 100 != 0) {
                System.out.println("Tahun kabisat");
            } else if (tahun % 400 == 0) {
                System.out.println("Tahun kabisat ");
            } else {
                System.out.println("Bukan tahun kabisat");
            }
        } else {
            System.out.println("Bukan tahun kabisat");
        }

        input15.close();
    }
}
