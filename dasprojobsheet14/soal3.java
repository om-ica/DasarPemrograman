package dasprojobsheet14;

import java.util.Scanner;

public class soal3 {
    static boolean isPrima(int n, int i) {
        if (n <= 1) {
            return false;
        } else if (i > Math.sqrt(n)) {
            return true;
        } else if (n % i == 0) {
            return false;
        } else {
            return isPrima(n, i + 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int n = input.nextInt();
        input.close();
        if (isPrima(n, 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}
