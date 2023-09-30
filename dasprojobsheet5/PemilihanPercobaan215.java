package dasprojobsheet5;

import java.util.Scanner;

public class PemilihanPercobaan215 {
    public static void main(String[] args) {
        
        Scanner input15 = new Scanner(System.in);

        System.out.print("Nilai UAS      :");
        float uas= input15.nextFloat();
        System.out.print("Nilai UTS      :");
        float uts= input15.nextFloat();
        System.out.print("Nilai Kuis     :");
        float kuis= input15.nextFloat();
        System.out.print("Nilai Tugas    :");
        float tugas= input15.nextFloat();

        float total = (uas*0.4F) + (uts*0.3F) + (kuis*0.1F) + (tugas*0.2F);
        
        char predikat=0;
        if (total < 39) {
            predikat='E';    
        } else if (total < 50) {
            predikat='D';
        } else if (total < 70) {
            predikat='C';
        } else if (total < 85) {
            predikat='B';
        } else if (total < 100) {
            predikat='B';
        } else {
            System.out.println("Nilai tidak valid");
        }

            System.out.println("\nPredikat nilai anda adalah " + predikat);

         //remidi atau tidak remidi   
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}
