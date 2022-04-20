package tugas;
/**
 *
 * @author nares
 */
public class strukBelanja {
    String nmBarang, tanggal;
    int noTransaksi, jumlah, total;
    
    strukBelanja(int nt, String tgl, String nb, int jml, int t){
    noTransaksi = nt;
    tanggal = tgl;
    nmBarang = nb;
    jumlah = jml;
    total = t;
    }
}
