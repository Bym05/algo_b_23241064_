import java.util.Scanner;

public class percepatankecepatan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai kecepatan awal (v0)
        System.out.print("Masukkan nilai kecepatan awal (v0) dalam m/s: ");
        double kecepatanAwal = scanner.nextDouble();

        // Meminta pengguna memasukkan nilai kecepatan akhir (v)
        System.out.print("Masukkan nilai kecepatan akhir (v) dalam m/s: ");
        double kecepatanAkhir = scanner.nextDouble();
        
        // Meminta pengguna memasukkan waktu (t)
        System.out.print("Masukkan nilai waktu (t) dalam detik: ");
        double waktu = scanner.nextDouble();
        
        // Memanggil fungsi untuk menghitung percepatan
        double percepatan = hitungPercepatan(kecepatanAwal, kecepatanAkhir, waktu);

        // Memanggil fungsi untuk menghitung kecepatan rata-rata
        double kecepatanRataRata = hitungKecepatanRataRata(kecepatanAwal, kecepatanAkhir);

        // Menampilkan hasil
        System.out.println("Percepatan adalah: " + percepatan + " m/s^2.");
        System.out.println("Kecepatan rata-rata adalah: " + kecepatanRataRata + " m/s.");
    }

    // Fungsi untuk menghitung percepatan
    public static double hitungPercepatan(double kecepatanAwal, double kecepatanAkhir, double waktu) {
        return (kecepatanAkhir - kecepatanAwal) / waktu;
    }

    // Fungsi untuk menghitung kecepatan rata rata
    public static double hitungKecepatanRataRata(double kecepatanAwal, double kecepatanAkhir) {
        return (kecepatanAwal + kecepatanAkhir) / 2;
    }
}