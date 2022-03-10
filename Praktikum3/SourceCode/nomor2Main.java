/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2;

/**
 *
 * @author nares
 */
import java.util.Scanner;
public class nomor2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tanah;
        System.out.println("Jumlah Tanah: ");
        tanah = sc.nextInt();
        nomor2[] n2 = new nomor2[tanah];
        System.out.println();
        
        for(int i = 0; i < n2.length; i++){
        n2[i] = new nomor2();
        System.out.println("Tanah " + (i+1));
        System.out.print("Panjang tanah: ");
        n2[i].panjang = sc.nextInt();
        System.out.print("Lebar Tanah: ");
        n2[i].lebar = sc.nextInt();
        System.out.println();
    }
        for(int i = 0; i < n2.length; i++){
        System.out.println("Luas tanah ke- " +(i+1) + ": " + n2[i].hitungLuas());
    }
    }
}
