
package latihan1;
public class nomor1 {

    String nama;
    int jumlah, hargaSatuan, hargaBayar, harga;
    float diskon;
    
    nomor1(){
        
    }
    nomor1(String nm, int jml, int hs){
        nama = nm;
        jumlah = jml;
        hargaSatuan = hs;
    }
    int hitungHargaTotal(int jumlah){
        harga = jumlah*hargaSatuan;
        return 0;
    }
    void hitungDiskon(){
        if(harga > 100000){
            diskon = (float)(harga*0.1);
        }else if(harga >= 50000 && harga <= 100000){
            diskon = (float)(harga*0.05);
        }
    }
    void hitungHargaBayar (){
        hargaBayar =(int) (harga - diskon);
    }
    void tampilBarang(){
        System.out.println("Nama Barang : " +nama);
        System.out.println("Jumlah Barang : " +jumlah);
        System.out.println("Harga Satuan Barang : " +hargaSatuan);
        System.out.println("Total Harga : " +harga);
        System.out.println("Diskon Barang : " +diskon);
        System.out.println("Harga Bayar : " +hargaBayar);
    }
}
