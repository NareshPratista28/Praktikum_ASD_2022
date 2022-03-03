
package fungsi;
import java.util.Scanner;
public class Fungsi {
    
        static String tokoCabang[] = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
        static String jenisBunga[] = {"Aglonema","Keladi","Alocasia","Mawar"};
        static int stockBunga[][] = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            do { 
                System.out.println("=================================================");
                System.out.println("---------SELAMAT DATANG DI ROYAL GARDEN----------");
                System.out.println("=================================================");
                System.out.println("1. Stock Bunga\t\t");
                System.out.println("2. Cek jumlah Stock Bunga\t");
                System.out.print("Silahkan Pilih Yang Diinginkan :");
                int pilihan = sc.nextInt();
                
                switch (pilihan) {
                    case 1: {
                    stockBunga();
                    }
                    break;
                    case 2: {
                    totalStock(tokoCabang, jenisBunga);
                    }
                    break;
                }
                System.out.println();
            } while (true);
    }
        static void stockBunga(){
            System.out.println("| Aglonema | Keladi | Alocasia | Mawar |");
            for (int x = 0; x < stockBunga.length; x++) {
            for(int y = 0; y < stockBunga.length; y++){
            System.out.print("   "+stockBunga[x][y]+"      ");
        }   
      System.out.println(" ");
    }
}
        static void totalStock(String tokoCabang[], String jenisBunga[])    {
            int totalAglo = stockBunga[0][0] + stockBunga[1][0] + stockBunga[2][0] + stockBunga[3][0];
            int totalKeldi = stockBunga[0][1] + stockBunga[1][1] + stockBunga[2][1] + stockBunga[3][1];
            int totalAlo = stockBunga[0][2] + stockBunga[1][2] + stockBunga[2][2] + stockBunga[3][2];
            int totalMaw = stockBunga[0][3] + stockBunga[1][2] + stockBunga[2][3] + stockBunga[3][3];
        
                System.out.println("=================================================");
                System.out.println("---------STOCK BUNGA PADA SEMUA CABANG-----------");
                System.out.println("=================================================");
                System.out.println("Aglonema\t: " + totalAglo);
                System.out.println("Keladi\t\t: " + totalKeldi);
                System.out.println("Alocasia\t: " + totalAlo);
                System.out.println("Mawar\t\t: " + totalMaw);
        }
            
    }
            
