package dasprouts;

import java.util.Scanner;

public class ganjl {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
        int nilai=0, counter=0;

        System.out.print("Input nilai\t\t: ");
        nilai=input.nextInt();

        int i = 0;
        while (i < nilai) {
            int digit = nilai % 10;
            if (digit % 2 != 0) {
                counter++;
            }
            nilai /= 10;
            i++;
        }
        System.out.println("Jumlah bilangan ganjil\t: " + nilai);
    }
}
