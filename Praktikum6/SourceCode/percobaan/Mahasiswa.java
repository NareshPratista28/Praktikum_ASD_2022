package percobaan;
/**
 *
 * @author nares
 */
public class Mahasiswa {
    String nama;
    int thnMasuk;
    int umur;
    double ipk;
    
    Mahasiswa(String n,int t, int u, double i){
        nama = n;
        umur = u;
        thnMasuk = t;
        ipk = i;
    }
    
    void tampil(){
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tahun Masuk: " + thnMasuk);
        System.out.println("IPK: " + ipk);
    }
}
