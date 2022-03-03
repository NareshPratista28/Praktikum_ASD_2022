
package array;
public class Array {

    public static void main(String[] args) {
        String tokoCabang[] = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4"};
        String jenisBunga[] = {"Aglonema","Keladi","Alocasia","Mawar"};
        int stockBunga[][] = {{10,5,15,7},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
        int totalAglo = stockBunga[0][0] + stockBunga[1][0] + stockBunga[2][0] + stockBunga[3][0];
        int totalKeldi = stockBunga[0][1] + stockBunga[1][1] + stockBunga[2][1] + stockBunga[3][1];
        int totalAlo = stockBunga[0][2] + stockBunga[1][2] + stockBunga[2][2] + stockBunga[3][2];
        int totalMaw = stockBunga[0][3] + stockBunga[1][2] + stockBunga[2][3] + stockBunga[3][3];

        System.out.println("Stock bunga pada semua cabang toko adalah :");
        System.out.println("======================================");
        System.out.println("Aglonema\t\t: " + totalAglo);
        System.out.println("Keladi\t\t\t: " + totalKeldi);
        System.out.println("Alocasia\t\t: " + totalAlo);
        System.out.println("Mawar\t\t\t: " + totalMaw);
        System.out.println("======================================");

        int aglo = stockBunga[0][0] - 1;
        int keldi = stockBunga[0][1] - 2;
        int alo = stockBunga[0][2] - 0;
        int maw = stockBunga[0][3] - 5;

        System.out.println("Pengurangan stock bunga pada Toko Royal Garden 1");
        System.out.println("======================================");
        System.out.println("Aglonema\t\t: "+ aglo);
        System.out.println("Keladi\t\t\t: "+ keldi);
        System.out.println("Alocasia\t\t: "+ alo);
        System.out.println("Mawar\t\t\t: "+ maw);
        System.out.println("======================================");
        int pendapatan = (aglo*75000) + (keldi*50000) + (alo*60000) + (maw*10000);
        System.out.println("");
        System.out.println("Pendapatan Toko Royal Garden 1 adalah sebesar : Rp. "+ pendapatan);
        }
}


//Naresh Pratista | 2141720057
    
    

