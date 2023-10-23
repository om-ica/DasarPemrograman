package dasprojobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan2 {
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        float sudut1, sudut2, sudut3, totalSudut;

        System.out.print("Sudut 1: ");
        sudut1=input15.nextFloat();
        System.out.print("Sudut 2: ");
        sudut2=input15.nextFloat();
        System.out.print("Sudut 3: ");
        sudut3=input15.nextFloat();

        totalSudut=sudut1+sudut2+sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segituga tersebut adalah segitiga siku-siku");
            else if ((sudut1 == 60) && (sudut1 == 60) && (sudut2 == 60))
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            else if ((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3))
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            else if ((sudut1 != 0) && (sudut1 != 0) && (sudut1 != 0))
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
        } else
            System.out.println("Bukan segitiga");

        input15.close();
    }
}
