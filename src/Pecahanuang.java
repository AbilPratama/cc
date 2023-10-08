import java.util.Scanner;

public class Pecahanuang {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            int nominalUang, SisaUang;
            int[] uang = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 100};

            System.out.print("Masukkan nominal uang : Rp.");
            nominalUang = input.nextInt();
            SisaUang = nominalUang;

            for (int i = 0; i < uang.length; i++) {
                if (uang[i] >= 1000) {
                    int lembar = SisaUang / uang[i];
                    if (lembar > 0) {
                        System.out.println(lembar + " lembar " + uang[i] + " ribuan");
                        SisaUang = SisaUang % uang[i];
                    }
                } else {
                    int perak = SisaUang / uang[i];
                    if (perak > 0) {
                        System.out.println(perak + " perak " + uang[i] + " perak");
                        SisaUang = SisaUang % uang[i];
                    }
                }
            }
        }
    }
}