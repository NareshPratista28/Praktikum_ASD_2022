package percobaan;
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
        System.out.println("Masukkan jumlah data mahasiswa");
        int jumMhs = s.nextInt();
        Mahasiswa[] input = new Mahasiswa[jumMhs];
        data.listMhs = input;
        
        System.out.println("==============================================");
        System.out.println("Masukkan data urut dari Nim terkecil");
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
            
            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }    
        System.out.println("________________________________________________________");
        System.out.println("Data Keseluruhan Mahasiswa : ");
        data.tampil();
            
        System.out.println("______________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari : ");
        System.out.print("NIM\t: ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
            
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
        
        System.out.println();
        System.out.println("==============================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.findBinarySearch(cari, 0, jumMhs -1);
        
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);
    }
}
