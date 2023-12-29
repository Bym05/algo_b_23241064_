import java.util.Scanner;

public class CetakAngka {
    public static void main(String[] args) {

        // variabel jumlah angka 
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Angka: ");
        int in = scan.nextInt();
    
        
        // Counted Looping For
        for (int i = 0; i < in; i++){
            System.out.print(i + " ");
        }
    }
}