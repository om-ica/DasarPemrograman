package dasprojobsheet11;

import java.util.Scanner;
import java.util.Random;

public class quiz {
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10)+1;
            boolean success=false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();
                if (answer < number) {
                    System.out.println("Nilainya lebih kecil dari jawaban");
                } else if (answer > number) {
                    System.out.println("Nilainya lebih besar dari jawaban\"");
                } else {
                    System.out.println("Jawaban anda benar");
                }
                success = (answer == number);
            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan(Y/y)?");
            menu = sc.nextLine().charAt(0);
        } while (menu=='y' || menu=='Y');

        sc.close();
    }
}
