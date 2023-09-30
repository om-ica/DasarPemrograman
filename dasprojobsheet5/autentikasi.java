package dasprojobsheet5;

import java.util.Scanner;

public class autentikasi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        String username=input.nextLine();
        System.out.print("Password: ");
        String password=input.nextLine();

        if (username.equals("iraya") && password.equals("123")) {
            System.out.print("Login berhasil");
        } else {
            System.out.println("Login gagal. Username dan Password salah");
        }

        input.close();
    }
}