
package jobsheet5.pangkat;
/**
 *
 * @author nares
 */
import java.util.Scanner;
public class pangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();
        
        pangkat[] png = new pangkat[elemen];
        for(int i=0; i < elemen; i++){
            png[i] = new pangkat();
            System.out.println("Masukkan nilai yang dipangkatkan: ");
            png[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat ke-"+(i+1)+": ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("Hasil pangkat dengan Brute Force");
        for(int i=0; i < elemen; i++){
            System.out.println("Nilai "+png[i].nilai+ " pangkat " +png[i].pangkat+ " adalah " +png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        }
        System.out.println("Hasil pangkat dengan Divide and Conquer");
        for(int i=0; i < elemen; i++){
            System.out.println("Nilai "+png[i].nilai+ " pangkat " +png[i].pangkat+ " adalah " +png[i].pangkatBF(png[i].nilai,png[i].pangkat));
    }
    
}
}