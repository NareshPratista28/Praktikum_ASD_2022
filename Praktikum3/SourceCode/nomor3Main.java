
package praktikum3;

/**
 *
 * @author nares
 */
import java.util.Scanner;
public class nomor3Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sv = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
        nomor3 [] n3 = new nomor3[3];
    
    for(int i = 0; i<3 ; i++){
        n3[i] = new nomor3();
            System.out.println("Masukkan data mahasiswa ke- " +(i+1));
            System.out.print("Masukkan Nama : ");
            n3[i].nama = sc.nextLine();
            System.out.print("Masukkan Nim : ");
            n3[i].nim = sv.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            n3[i].jKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            n3[i].ipk = sx.nextDouble();
            System.out.println();
    }
    for(int i = 0; i<3; i++){
        System.out.println("Data mahasiswa ke-" +(i+1));
        System.out.println("Nama : " + n3[i].nama);
        System.out.println("Nim : " + n3[i].nim);
        System.out.println("Jenis Kelamin : " + n3[i].jKelamin);
        System.out.println("IPK : " + n3[i].ipk);
        System.out.println();
    }
  }
}    

