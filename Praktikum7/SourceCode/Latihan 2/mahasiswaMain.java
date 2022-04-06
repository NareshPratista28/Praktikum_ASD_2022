package Latihan2_praktikum;

/**
 *
 * @author nares
 */
import java.util.Scanner;
public class mahasiswaMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        
        pencarianMhs data = new pencarianMhs();
        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int jumMhs = s.nextInt();
        mahasiswa[] inputan = new mahasiswa[jumMhs];
        data.listMhs=inputan;
        
        System.out.println("-----------------------------------------------------");
        System.out.println("Masukkan data mahasiswa");
        for(int i=0; i < jumMhs; i++){
            System.out.println("-----------------------------------------------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();
            
            mahasiswa m = new mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }    
        System.out.println("________________________________________________________");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();
            
        System.out.println("______________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari : ");
        System.out.print("Nama\t: ");
        String cari = sl.nextLine();

        System.out.println();
        System.out.println("==============================================");
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.findSeqSearch(cari);
        
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}   