package dasprojobsheet10;

import java.util.Arrays;

public class numbers15 {
    public static void main(String[] args) {
        
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        System.out.println("Array awal");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        // Menemukan panjang maksimal dari setiap baris

        int panjangMaksimum=0;

        for (int i = 0; i < myNumbers.length; i++) {
            if (myNumbers[i].length > panjangMaksimum) {
                panjangMaksimum=myNumbers[i].length;
            }
        }

        // Array baru dengan panjang maksimum

        int[][] newArray = new int[myNumbers.length][panjangMaksimum];
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                newArray[i][j] = myNumbers[i][j];
            }
        }

        System.out.println("\nArray baru");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i+1) + " : " + newArray[i].length);
        }
    }
}
