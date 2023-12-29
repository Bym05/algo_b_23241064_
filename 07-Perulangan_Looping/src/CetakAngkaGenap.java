import java.util.Scanner;

public class CetakAngkaGenap {
    public static void main(String[] args) {

         // variabel jumlah angka 
            Scanner scan = new Scanner(System.in);
            System.out.print("Masukkan Angka: ");
            int in = scan.nextInt();
        
        // Counted Looping For
        for (int i = 2; i < in; i+=2){
            System.out.print(i + " ");
        }
    }
}
