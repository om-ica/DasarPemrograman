package dasprojobsheet7;

import java.util.Scanner;

public class DoWhileCuti15 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah cuti\t: ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print("\nApakah anda ingin mengambil cut(y/t)?");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari\t: ");
                jumlahHari = sc.nextInt();

                if (jumlahHari < jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti\t: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi.");
                    
                }
            } else if (konfirmasi.equalsIgnoreCase("t")) {
                System.out.println("Sisa jatah cuti\t: " + jatahCuti);
                break;
            }

        } while (jatahCuti > 0);

        sc.close();
    }
}
