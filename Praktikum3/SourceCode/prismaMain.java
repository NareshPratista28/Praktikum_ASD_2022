/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

/**
 *
 * @author nares
 */
import java.util.Scanner;
public class prismaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prism;
        
            System.out.print("Jumlah Prisma : ");
            prism = sc.nextInt();
            prisma [] prsm = new prisma[prism];
    
            for(int i = 0; i<prsm.length; i++){
                    prsm[i] = new prisma();
                    System.out.println("Prisma ke- " +(i+1));
                    System.out.print("Alas : ");
                    prsm[i].alas = sc.nextDouble();
                    System.out.print("Tinggi : ");
                    prsm[i].tinggi = sc.nextDouble();
                    System.out.print("Sisi Tegak : ");
                    prsm[i].sisiTegak = sc.nextDouble();
                    System.out.println();
    }
            for(int i = 0; i<prsm.length; i++){
                System.out.println("Luas Permukaan Prisma ke- " +(i+1) + ": " + prsm[i].hitungLuasPermukaan());
                System.out.println("Volume Prisma ke- " +(i+1) + ": " + prsm[i].hitungVolume());
                System.out.println();
    }
    }
}
 
