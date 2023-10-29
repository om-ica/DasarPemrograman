package dasprojobsheet9;

import java.util.Scanner;

public class rata2BilanganBulat {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double[] bilangan = new double[8];
        double rata2, total=0;

        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Masukkan Bilangan ke-" + (i+1) + " : ");
            bilangan[i]=sc.nextInt();

            total += bilangan[i];
        }

        rata2 = total/bilangan.length;

        System.out.println("\nRata-ratanya adalah " + rata2);

        sc.close();
    }
}
