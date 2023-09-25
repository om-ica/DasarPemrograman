package dasprojobsheet5;

import java.util.Scanner;

public class PemilihanPercobaan215 {
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        System.out.println("Nilai UAS      :");
        float uas= input15.nextFloat();
        System.out.println("Nilai UTS      :");
        float uts= input15.nextFloat();
        System.out.println("Nilai Kuis     :");
        float kuis= input15.nextFloat();
        System.out.println("Nilai Tugas    :");
        float tugas= input15.nextFloat();

        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}
