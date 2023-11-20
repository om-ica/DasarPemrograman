package dasprojobsheet11;

import java.util.Scanner;

public class nestedLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double ratarata=0;

        double[][] temps = new double[5][7];
        double[] mean = new double[5];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j+1) + ": ");;
                temps[i][j] = sc.nextDouble();
                mean[i] += temps[i][j];
            }
            System.out.println();
        }

        for (int i = 0; i < mean.length; i++) {
             ratarata = mean[i]/temps[0].length;
        }

        int k = 1;
        for (double kategori[] : temps) {
            System.out.println("Kota ke-" + k + ": ");
            for (double baru : kategori) {
                System.out.print(baru + " ");
            }
            System.out.println();
            k++;
        }
        
        System.out.println("Rata-rata: " + ratarata);
        sc.close();
    }
}
