package percobaan;

/**
 *
 * @author nares
 */
public class Mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;
    
    Mahasiswa(int n,String na, int u, double i){
        nim = n;
        nama = na;
        umur = u;
        ipk = i;
    }
    
    void tampil(){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("IPK: " + ipk);
    }
}
