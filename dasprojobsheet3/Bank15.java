import java.util.Scanner;

public class Bank15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float jml_tabungan_awal, lama_menabung;
        double prosentase_bunga =0.02, bunga, jml_tabungan_akhir;

        System.out.println("masukkan jumlah tabungan awal anda");
        jml_tabungan_awal = input.nextFloat();
        System.out.println("masukkan lama menabung anda");
        lama_menabung= input.nextFloat();
        bunga= lama_menabung*prosentase_bunga*jml_tabungan_awal;
        jml_tabungan_akhir=bunga+jml_tabungan_awal;

        System.out.println("Jumlah tabunga akhir anda adalah " +jml_tabungan_akhir);

    }
}
