
package jobsheet5;
/**
 *
 * @author nares
 */
import java.util.Scanner;
public class faktorialMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input nilai yang difaktorialkan: ");
        int elemen = sc.nextInt();
        
        faktorial[] fk = new faktorial[elemen];
        for(int i=0; i < elemen; i++){
            fk[i] = new faktorial();
            System.out.println("Data ke-"+(i+1)+": ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("========================================");
        System.out.println("Hasil faktorial dengan brute force");
        for(int i=0; i < elemen; i++){
            System.out.println("Hasil faktorial dari nilai " + fk[i].nilai);
        }
    }
    
}
