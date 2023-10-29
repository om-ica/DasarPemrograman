package dasprojobsheet9;

import java.util.Scanner;

public class PengisianElemen {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] nilai = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Nilai ke-" + (i+1) + " : ");
            nilai[i]=sc.nextInt();
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println("Nilai ke-" + (i+1) + " : " + nilai[i]);
        }

        sc.close();
    }
}
