package dasprouts;

import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int nilai=0, itot=0, total=0;

        System.out.print("Input nilai: ");
        nilai=input.nextInt();

        int i = 1;
        while (i <= nilai) {
            itot = i*i;
            total += itot;

            i++;
        }

        System.out.println("Hasil: " + total);

        input.close();
    }
}
