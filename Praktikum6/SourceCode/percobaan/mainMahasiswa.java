package percobaan;
/**
 *
 * @author nares
 */
public class mainMahasiswa {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa m1 = new Mahasiswa("Nusa", 2017, 25, 3);
        Mahasiswa m2 = new Mahasiswa("Rara", 2012, 19, 4);
        Mahasiswa m3 = new Mahasiswa("Dompu", 2018, 19, 5);
        Mahasiswa m4 = new Mahasiswa("Abdul", 2017, 23, 2);
        Mahasiswa m5 = new Mahasiswa("Ummi", 2019, 21, 3.75);
        
        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        
        System.out.println("Data Mahasiswa Sebelum Sorting = ");
        list.tampil();
        
        System.out.println("Data Mahasiswa Setelah Sorting Desc Berdasarkan IPK"); //desc = besar ke kecil
        list.bubbleSort();
        list.tampil();
        
        System.out.println("Data Mahasiswa Setelah Sorting Asc Berdasarkan IPK"); //asc = kecil ke besar
        list.selectionSort();
        list.tampil();
        
        System.out.println("Data Mahasiswa Setelah Insertion Sorting Asc Berdasarkan IPK"); //asc = kecil ke besar
        list.insertionSort(true);
        list.tampil();
        
        System.out.println("Data Mahasiswa Setelah Insertion Sorting Desc Berdasarkan IPK"); //desc = besar ke kecil
        list.insertionSort(false);
        list.tampil();
    } 
}
