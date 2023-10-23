package dasprojobsheet7;

import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String namaPerempuan="salah";

        System.out.println("Jumalah mahasiswa\t: 30");
        
        for (int i=1; i <= 30; i++) {  
            System.out.print("Nama mahasiswa ke-" + i + ": ");
            String namaMahasiswa=input.nextLine();
            System.out.print("Jenis Kelamin mahasiswa ke-" + i + "(L/P): " );
            String jnsKelamin=input.nextLine();

            if (jnsKelamin.equalsIgnoreCase("P")) {
                namaPerempuan += namaMahasiswa + "\n";
            }
        }    
        System.out.println("Nama mahasiswa perempuan\t: " + namaPerempuan);    
    }
}
