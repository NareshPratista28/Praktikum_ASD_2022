
package tugas2;
import java.util.Scanner;
public class Tugas2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapakah Nilai Kecepatannya? : ");
        Double kcptn = sc.nextDouble();
        System.out.print("Berapakah Nilai Jaraknya? : ");
        Double jrk = sc.nextDouble();
        System.out.print("Berapakah Nilai Waktunya? : ");
        Double wktu = sc.nextDouble();
        
        do{
                System.out.println("=================================================");
                System.out.println("-------------Pilihan Perhitungan-----------------");
                System.out.println("=================================================");
                System.out.println("1. Kecepatan\t\t");
                System.out.println("2. Jarak\t");
                System.out.println("3. Waktu\t");         
                System.out.print("Silahkan Pilih Yang Diinginkan :");
                int pilihan = sc.nextInt();
                
                switch(pilihan){
                    case 1:
                        System.out.print("\nKecepatannya adalah " +kecepatan(jrk,wktu));
                        break;
                    case 2:
                        System.out.print("\nJaraknya adalah " +jarak(kcptn,wktu));
                        break;
                    case 3:
                        System.out.print("\nWaktunya adalah " +waktu(jrk,kcptn));
                        break;
                             
                } 
                System.out.println();
        } while(true);
    }
    static Double kecepatan(Double jrk, Double wktu){
        Double kcptn = jrk/wktu;
        return kcptn;
    }
    static Double jarak(Double kcptn, Double wktu){
        Double jrk = kcptn*wktu;
        return jrk;
    }
    static Double waktu(Double jrk, Double kcptn){
        Double wktu = jrk/kcptn;
        return wktu;
    }

}

