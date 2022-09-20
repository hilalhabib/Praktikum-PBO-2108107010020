import java.util.Scanner;

/**
 * Created by Alpin on 05/04/2017.
 */
public class Program5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x ;
        int i ;
        //System.out.print("Masukkan angka = ");
        //int angka = input.nextInt();
        System.out.println(" ");
        for (i=0;i<11;i++){
            if(i%3==0){
                System.out.print("");

            }else{
                x=2*i;
                System.out.print(" "+x);

            }
        }

    }
    }
