
package pertemuan2;

public class Barang {
        String namaBarang, jenisBarang;
        int stok, hargaSatuan;
        
        Barang(){
            
        }
        
        Barang(String nm, String jn, int st, int hg){
            namaBarang = nm;
            jenisBarang = jn;
            stok = st;
            hargaSatuan = hg;
        }    
        void tampilBarang(){
            System.out.println("Nama Barang: " +namaBarang);
            System.out.println("Jenis Barang: " +jenisBarang);
            System.out.println("Stok : " +stok);
            System.out.println("Harga Satuan: " +hargaSatuan);
    }
        void tambahStok(int n){
            stok = stok + n;
        }
        void kurangiStok(int n){
            stok = stok - n;
        }
        int hitungHargaTotal(int jumlah){
            return jumlah*hargaSatuan;
        }
    }
    

