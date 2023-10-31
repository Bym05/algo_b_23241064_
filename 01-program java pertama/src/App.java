public class App {
    public static void main(String[] args) throws Exception {
        // Program Biodata Mahasiswa
        // deklarasi variabel
        String nama;
        String nim;
        String tgl_lahir;
        String alamat;
        float berat_badan;
        float tinggi_badan;

        // mengisi variabel
        nama = "Bym";
        nim = "23241064";
        tgl_lahir = "05 Juli 2003";
        alamat = "Talabiu Woha Bima";
        berat_badan = 64.5f;
        tinggi_badan = 172.5f;

    // cetak Biodata
    System.out.println("======================");
    System.out.println("Nama : " + nama);
    System.out.println("NIM :" + nim);
    System.out.println("Tanggal Lahir :" + tgl_lahir);
    System.out.println("Alamat :" + alamat);
    System.out.println("Berat Badan :" + berat_badan);
    System.out.println("Tinggi Badan :" + tinggi_badan);
    System.out.println("======================");
    }
}