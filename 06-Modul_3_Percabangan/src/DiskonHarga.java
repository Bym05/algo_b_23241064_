import java.util.Scanner;

public class DiskonHarga {
    public static void main(String[] args) {

        // Membuat Scanner Scan
        Scanner scan = new Scanner(System.in);

        // Data Member dan Memasukkan Input Dari Keyboard
        System.out.print("Apakah Pelanggan Memiliki Membercard? (Iya/Tidak): ");
        String MemilikiMembercard = scan.next();

        // IF Statement
        if (MemilikiMembercard.equalsIgnoreCase("Iya")) {
            System.out.print("Total belanja (dalam rb): ");
            double totalBelanja = scan.nextDouble();

            if (totalBelanja > 500000 ) {
                System.out.println("Pelanggan Mendapatkan Diskon Sebesar 50rb.");
            } else if (totalBelanja > 100000 ) {
                System.out.println("Pelanggan Mendapatkan Diskon Sebesar 15rb.");
            } else {
                System.out.println("Pelanggan Tidak Mendapatkan Diskon.");
            }
        } else {
            System.out.print("Total belanja (dalam rb): ");
            double totalBelanja = scan.nextDouble();

            if (totalBelanja > 100000 ) {
                    System.out.println("Pelanggan Mendapatkan Diskon Sebesar 10rb.");              
            } else {
                    System.out.println("Pelanggan Tidak Mendapatkan Diskon.");
            }
        }
    }
}