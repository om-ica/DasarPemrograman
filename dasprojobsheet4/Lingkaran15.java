package dasprojobsheet4;

import java.util.Scanner;

public class Lingkaran15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int r;
        double keliling, luas, phi;
        phi=3.14;

        System.out.println("Masukkan jari-jari lingkaran: ");
        r= input.nextInt();

        keliling=2*phi*r;
        luas=phi*r*r;

        System.out.println("\nKeliling: " + keliling);
        System.out.println("Luas: " + luas);

        input.close();
    }
}
