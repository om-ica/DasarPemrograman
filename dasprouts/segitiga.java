package dasprouts;

import java.util.Scanner;

public class segitiga {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int sudut1=0, sudut2=0, sudut3=0;

        System.out.print("Sudut 1\t\t: ");
        sudut1=input.nextInt();
        System.out.print("Sudut 2\t\t: ");
        sudut2=input.nextInt();
        System.out.print("Sudut 3\t\t: ");
        sudut3=input.nextInt();

        if (sudut1+sudut2+sudut3 == 180) { 
            if (sudut1 > 0 && sudut2 > 0 && sudut3 > 0) {
                if (sudut1 < 180 || sudut2 < 180 || sudut3 < 180) {
                    
                }
            } 
        } else {
            System.out.println("Input tidak sesuai");
        }

        if (sudut1 == sudut2+sudut3 || sudut2 == sudut1+sudut3 || sudut3 == sudut1+sudut2) {
            System.out.println("SIKU-SIKU");
        } else {
            System.out.println("BUKAN SIKU-SIKU");
        }

        input.close();
    }
}
