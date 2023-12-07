package dasprojobsheet14;

import java.util.Scanner;

public class percobaan2 {
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print(1 + " = ");
            return 1;
        } else {
            System.out.print(x+ "x");
            return (x*hitungPangkat(x, y-1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan=sc.nextInt();
        System.out.print("Masukkan pangkat: ");
        int bilpangkat=sc.nextInt();
        sc.close();

        System.out.print(hitungPangkat(bilangan, bilpangkat));
    }
}
