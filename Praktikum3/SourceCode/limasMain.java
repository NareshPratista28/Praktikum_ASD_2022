/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

import java.util.Scanner;
public class limasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lms;
        
            System.out.print("Masukkan Jumlah Limas : ");
            lms = sc.nextInt();
            limas [] lim = new limas[lms];
    
            for(int i = 0; i<lim.length; i++){
                    lim[i] = new limas();
                    System.out.println("Limas ke- " +(i+1));
                    System.out.print("Alas : ");
                    lim[i].alas = sc.nextDouble();
                    System.out.print("Tinggi : ");
                    lim[i].tinggi = sc.nextDouble();
                    System.out.print("Sisi Tegak : ");
                    lim[i].sisiTegak = sc.nextDouble();
                    System.out.println();
    }
            for(int i = 0; i<lim.length; i++){
                System.out.println("Luas Permukaan Limas ke- " +(i+1) + ": " + lim[i].hitungLuasPermukaan());
                System.out.println("Volume Limas ke- " +(i+1) + ": " + lim[i].hitungVolume());
                System.out.println();
    }
    }
}
 
   

