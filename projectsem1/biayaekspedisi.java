package projectsem1;

import java.util.Scanner;

public class biayaekspedisi {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    //input data
    double brtBarang, jrkPengiriman, ttlHarga, hargaPerKilogram;
    String jnsLayanan, jnsPengiriman, estimasi;

    System.out.println("Masukkan berat barang: ");
    brtBarang=input.nextDouble();
    System.out.println("Masukkan jenis layanan(Darat/Laut/Udara): ");
    jnsLayanan=input.next();
    System.out.println("Masukkan jenis pengiriman(Reguler/Express/Kargo): ");
    jnsPengiriman=input.next();
    System.out.println("Masukkan jarak pengiriman: ");
    jrkPengiriman=input.nextDouble();

    
    //menentukan harga

    if (jnsLayanan.equals("Darat")) {
        if (jnsPengiriman.equals("Reguler")) {
            hargaPerKilogram=2000.0;    
        } else if (jnsPengiriman.equals("Express")) {
            hargaPerKilogram=4000.0; 
       
        }
        
    } else if (jnsLayanan.equals("Laut")) {
        if (jnsPengiriman.equals("Reguler")) {
            hargaPerKilogram=3000.0;
        } else if (jnsPengiriman.equals("Express")) {
            hargaPerKilogram=5000.0;  
            
        }
        
    } else if (jnsLayanan.equals("Udara")) {
        if (jnsPengiriman.equals("Reguler")) {
            hargaPerKilogram=10000.0;
        } if (jnsPengiriman.equals("Express")) {
            hargaPerKilogram=15000.0;

        }

    }

    //menentukan total harga
        ttlHarga=brtBarang*hargaPerKilogram;

    //menampilkan estimasi waktu

    if (jnsLayanan.equals("Darat")) {
        estimasi="3-5 Hari";
    } if (jnsLayanan.equals("Laut")) {
        estimasi="7-14 Hari";
    } if (jnsLayanan.equals("Udara")) {
        estimasi="1-2 Hari";
    }

    // output hasil
    System.out.println("Harga pengiriman Rp: " + ttlHarga);
    System.out.println("Estimasi waktu pengiriman: " + estimasi);

    input.close();
    }
    
}
