import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        // Data Member
        int total_belanja = 0;

        // membuat scanner menerima input dari keyboarad
        Scanner scan = new Scanner(System.in);

        // mengambil input dari keyboard
        System.out.print("Apakah Pelanggan Memiliki Membercard? (Iya/Tidak): ");
        String MemilikiMembercard = scan.next();
        System.out.print("Masukan Total belanja (dalam rb) : ");
        total_belanja = scan.nextInt();

        // cek total belanja
        if (total_belanja >= 500000 ) {
            System.out.println("Pelanggan Mendapatkan Diskon Sebesar 50rb.");           
        } else {
            System.out.println("Anda Mendapatkan Diskon : 10rb");
        }
        if (total_belanja >= 100000 ) {
            System.out.println( "Anda Mendapatkan Diskon : 15rb");            
        } else {
            System.out.println("Belanja Anda Kurang Dari Rp. 500000");
        }

        System.out.println("Terima Kasih Telah Belanja di Toko Kami");
    }
}