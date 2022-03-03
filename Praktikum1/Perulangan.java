
package Perulangan;
import java.util.Scanner;
public class Perulangan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nim, n;

        System.out.print("Silahkan Masukkan NIM anda : ");
        nim = sc.nextInt();
        System.out.println("===========================");
        
        n = nim - 2041720000;
        if(n<10){
             n += 10;
         }
         System.out.println("n : " + n);
            
         for(int i=0; i<n; i++){
         int tiapHari = i%7;
         if (tiapHari==0){
         System.out.print("Senin ");
         }else if (tiapHari==1){
            System.out.print("Selasa ");
         }else if (tiapHari==2){
            System.out.print("Rabu ");
         }else if (tiapHari==3){
            System.out.print("Kamis ");
         }else if (tiapHari==4){
            System.out.print("Jumat ");
         }else if (tiapHari==5){
            System.out.print("Sabtu ");
         }else if(tiapHari== 6){
            System.out.print("Minggu ");
         }else {
         System.out.println();
        }
    }
}
}
    
   
//Naresh Pratista | 2141720057