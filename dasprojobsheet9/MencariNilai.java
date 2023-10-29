package dasprojobsheet9;

import java.util.Scanner;

public class MencariNilai {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jmlElemen;
        int nilaiMaks=0, nilaiMin=100, total=0, rata2=0;

        System.out.print("Masukkan jumlah elemen: ");
        jmlElemen=sc.nextInt();

        int[] nilai = new int[jmlElemen];

        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan nilai ke-" + (i+1) + " : ");
            nilai[i]=sc.nextInt();

            if (nilai[i] > nilaiMaks) {
                nilaiMaks = nilai[i];
            } 
            if (nilai[i] < nilaiMin) {
                nilaiMin = nilai[i];
            }
            
                total += nilai[i];
        }

        rata2 = total/jmlElemen;

        System.out.println("\nNilai tertingginya adalah " + nilaiMaks);
        System.out.println("Nilai terendahnya adalah " + nilaiMin);
        System.out.println("Nilai rata-ratanya adalah " + rata2);

        sc.close();
    }
}
