
package praktikum1;
/**
 *
 * @author nares
 */
import java.util.Scanner;
public class kubusMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan banyak Kubus : ");
        int ku = sc.nextInt();
        
        kubus [] kb = new kubus[ku];
        for(int i=0;i<kb.length;i++){
            System.out.print("Masukkan Sisi ke- "+(i+1)+" : ");
            int si = sc.nextInt();
            kb[i]= new kubus(si);
        }
        for(int i=0;i<kb.length;i++){
            System.out.println("Kubus ke- "+(i+1));
            System.out.println("Sisi : "+kb[i].sisi);
            System.out.println("Luas Permukaan ke- "+(i+1)+" : "+kb[i].luasPermukaan());
            System.out.println("Volume ke- "+(i+1)+" : "+kb[i].Volume());
        }
    }
}
