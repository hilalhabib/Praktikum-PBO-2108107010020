import java.util.Scanner;

public class Program2 {
    public static void main (String args[] ) {
       Scanner in = new Scanner(System.in);
      int nilai = -1;
      System.out.print("Masukkan Nilai Angka: ");
      nilai = in.nextInt();

        if (nilai >= 87 && nilai < 100) {
            System.out.println("Nilai Huruf = A dan Nilai Angka = 4 ");
        }
        else if (nilai < 87 && nilai >= 78) {
            System.out.println("Nilai Huruf = AB dan Nilai Angka = 3.50 ");
        }
        else if (nilai < 78 && nilai >= 69) {
            System.out.println("Nilai Huruf = B dan Nilai Angka = 3.00 ");
        }
        else if (nilai < 69 && nilai >= 60) {
            System.out.println("Nilai Huruf = BC dan Nilai Angka = 2.50 ");
        }
        else if (nilai < 60 && nilai >= 51) {
            System.out.println("Nilai Huruf = C dan Nilai Angka = 2.00 ");
        }
        else if (nilai < 51 && nilai >= 41) {
            System.out.println("Nilai Huruf = D dan Nilai Angka = 1.00 ");
        }
        else if (nilai < 41) {
            System.out.println("Nilai Huruf = E dan Nilai Angka = 0 ");
        }
        else {
            System.out.println("Invalid Score!! ");
        }
    }
}
