package dasprojobsheet7;

import java.util.Scanner;

public class WhileGaji15 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur=0;
        double gajiLembur = 0, totalGajiLembur = 0;
        String jabatan="error";

        System.out.print("Masukkan jumah karyawan\t\t: ");
        jumlahKaryawan = scan.nextInt();

        int i = 0;
        while (i < jumlahKaryawan) {
            System.out.println("\nPilihan jabatan - Direktur, Manajer, Karyawan.");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + "\t: ");
            jabatan = scan.next();
            System.out.print("Masukkan jumlah jam lembur\t: ");
            jumlahJamLembur = scan.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("Direktur")) {
                continue; 
            } else if (jabatan.equalsIgnoreCase("Manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan invalid. Masukkan jabatan yang sesuai.");
                i--;
                continue;
            }

            totalGajiLembur += gajiLembur;

        }
        
            System.out.print("\nTotal gaji lembur\t\t: " + totalGajiLembur);

        scan.close();
    }
}
