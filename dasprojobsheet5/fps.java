package dasprojobsheet5;

import java.util.Scanner;

public class fps {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String jnsSenjata="senjata", srnSenjata;
        int jrkSerangan=0;

        System.out.println("------------------------------------------------");

        //input jarak serangan
        System.out.print("Masukkan jarak serangan\t\t: ");
        jrkSerangan=input.nextInt();

        //menetukan jenis senjata
        if (jrkSerangan <= 5) {
            jnsSenjata="Melee weapon";
        } else if (jrkSerangan > 5 && jrkSerangan < 1000) {
            jnsSenjata="Range weapon";
        } else {

        }

        //menetukan saran senjata
        srnSenjata=jnsSenjata;

        System.out.print("Jenis senjata yang disarankan\t: " + srnSenjata);

        System.out.println("\n------------------------------------------------");
        input.close();

    }
}
