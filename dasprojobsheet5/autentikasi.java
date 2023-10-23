package dasprojobsheet5;

import java.util.Scanner;

public class autentikasi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------------");

        System.out.print("Username\t: ");
        String username=input.nextLine();
        System.out.print("Password\t: ");
        String password=input.nextLine();

        if (username.equals("iraya") && password.equals("123")) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal. Username dan Password salah");
        }

        System.out.println("------------------------------------------------------");

        input.close();
    }
}