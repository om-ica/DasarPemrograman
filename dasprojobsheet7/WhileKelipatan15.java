package dasprojobsheet7;

import java.util.Scanner;

public class WhileKelipatan15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int kelipatan, total=0, counter=0;

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = input.nextInt();

        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
            i++;
        }

        double rata2 = (double) total/counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.println("Rata-ratanya adalah " + rata2);

        input.close();
    }
}
