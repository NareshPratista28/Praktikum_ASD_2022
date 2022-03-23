package jobsheet5.latihan;
/**
 *
 * @author nares
 */
import java.util.Scanner;
public class LatihanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("===========PORTAL PEMILIHAN BEM 2020============");
        System.out.println("================================================");
        Latihan vte = new Latihan();
        Latihan[] bm = new Latihan[vte.jmlhKandidat];
        
        for (int i = 0; i < vte.jmlhKandidat; i++){
            bm[i] = new Latihan();
            System.out.println("Nama Kandidat Presiden BEM ke- " + (i+1) + ": ");
            bm[i].kandidat = sc.nextLine();
      }
       for (int i = 0; i < vte.jmlhKandidat; i++){
           System.out.println("Masukkan Jumlah Pemilih Kandidat BEM ke- " + (i+1) + ": ");
           bm[i].vote = sc.nextInt();
           vte.jmlhVote += bm[i].vote;
      }
       System.out.println("================================================");
       int hasil_bm = vte.hitungHasilSuara(vte.jmlhVote, bm[0].vote, bm[1].vote, bm[2].vote, bm[3].vote);
       if(hasil_bm == 0) {
            System.out.println("Kandidat memiliki mayoritas hampir sama");
      }else{
            System.out.println("Presiden BEM Terpilih Adalah " + bm[hasil_bm-1].kandidat);
        
       }   
    }
}