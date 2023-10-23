package dasprojobsheet6;

import java.util.Scanner;

public class BilanganTerbesar {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int bil1=28, bil2=54, bil3=15, bilMaks;

        System.out.println("Bilangan 1: " + bil1);
        System.out.println("Bilangan 2: " + bil2);
        System.out.println("Bilangan 3: " + bil3);

        bilMaks=bil1;
            
        if (bil2 > bilMaks) {
            bilMaks=bil2;
        }
        if (bil3 > bilMaks) {
            bilMaks=bil3;
        }

        System.out.println("Bilangan terbesar adalah " + bilMaks);

        input.close();
    }
}
