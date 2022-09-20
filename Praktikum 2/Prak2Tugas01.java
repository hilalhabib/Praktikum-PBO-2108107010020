import java.util.Scanner;

public class Program1 {
    
    public static void main(String[] args) {
        int angka1;
        int angka2;
        double a = 3;
        double b = 2;
        double hasilpembagian;
        int hasil;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        // penjumlahan
        hasil = angka1 + angka2;
        System.out.println("num1 + num2 = " + hasil);
        
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        // pengurangan
        hasil = angka1 - angka2;
        System.out.println("num1 - num2 = " + hasil);
        
         System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        // perkalian
        hasil = angka1 * angka2;
        System.out.println("num1 * num2 = " + hasil);
        
        
        System.out.print("Input angka-1: ");
        angka1 = keyboard.nextInt();
        System.out.print("Input angka-2: ");
        angka2 = keyboard.nextInt();
        
        // Pembagian
        hasilpembagian = a / b;
        System.out.println("num1 / num2 = " + hasilpembagian);
        
        System.out.print("Input angka-1: ");
        a = keyboard.nextDouble();
        System.out.print("Input angka-2: ");
        b = keyboard.nextDouble();
        
        // Sisa Bagi
        hasil = angka1 % angka2;
        System.out.println("num1 % num2 = " + hasil);
        
    }
    
}
