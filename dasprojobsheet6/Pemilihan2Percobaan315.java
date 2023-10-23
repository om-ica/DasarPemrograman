package dasprojobsheet6;

import java.util.Scanner;

public class Pemilihan2Percobaan315 {
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        String kategori;
        int penghasilan, gajiBersih;
        double pajak=0;

        System.out.print("Masukkan kateogri\t\t: ");
        kategori=input15.nextLine();
        System.out.print("Masukkan besarnya penghasilan\t: ");
        penghasilan=input15.nextInt();

        if (kategori.equalsIgnoreCase("Pekerja")) {
            if (penghasilan <= 2000000)
                pajak=0.1;
            else if (penghasilan <=3000000)
                pajak=0.15;
            else
                pajak=0.2;
            gajiBersih=(int) (penghasilan- (pajak*penghasilan));
            System.out.print("Penghasilan bersih\t\t: " + gajiBersih);
        } else if (kategori.equals("Pebisnis")) {
            if (penghasilan <= 2500000)
                pajak=0.15;
            else if (penghasilan <= 3500000)
                pajak=0.2;
            else
                pajak=0.25;
            gajiBersih=(int) (penghasilan-(pajak*penghasilan));
            System.out.println("Penghasilan bersih\t\t: " + gajiBersih);
        }  else
            System.out.println("Masukan kategori salah");

        input15.close();
    }
}
