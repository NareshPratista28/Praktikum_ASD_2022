
package latihan1;

public class nomor1Main {
    
    public static void main(String[] args) {
        nomor1 b1 = new nomor1();
        b1.nama = "Botol Minum";
        b1.jumlah = 5;
        b1.hargaSatuan = 120000;
        b1.hitungHargaTotal(b1.jumlah);    
        b1.hitungDiskon();
        b1.hitungHargaBayar();
        b1.tampilBarang();
    }
}
