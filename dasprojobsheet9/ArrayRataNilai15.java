package dasprojobsheet9;

import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jmlElemen, jmlLulus=0, jmlTidakLulus=0;
        double totalLulus=0, totalTidakLulus=0, rataLulus, rataTidakLulus;

        System.out.print("Masukkan jumlah elemen\t\t: ");
        jmlElemen=input.nextInt();

        int[] nilaiMhs = new int[jmlElemen];

        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i]=input.nextInt();
        }

        for (int i = 0; i < jmlElemen; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                if (nilaiMhs[i] < 70) {
                    totalTidakLulus += nilaiMhs[i];
                    jmlTidakLulus++;
                }
            }
            
        }

        if (jmlLulus > 0) {
            rataLulus = totalLulus / jmlLulus;
            System.out.print("\nRata-rata nilai lulus = " + rataLulus);
        }

        if (jmlTidakLulus > 0) {
            rataTidakLulus = totalTidakLulus / jmlTidakLulus;
            System.out.println("\nRata-rata nilai tidak lulus = " + rataTidakLulus);
        }

        
        

        input.close();
    }
}
