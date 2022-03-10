
package jobsheet3;

/**
 *
 * @author nares
 */
import java.util.Scanner;

public class persegiPanjangMain {

    public static void main(String[] args) {
        persegiPanjang[] ppArray = new persegiPanjang[3];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++)
        {   
            ppArray[i] = new persegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
