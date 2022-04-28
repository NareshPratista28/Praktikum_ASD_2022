package praktikum2;
/**
 *
 * @author nares
 */
import java.util.Scanner;
public class QueueMain {
    
public static void menu(){
    System.out.println("\nPilih Menu ");
    System.out.println(" 1. Antrian baru\n 2. Antrian Keluar\n 3. Cek Antrian Terdepan\n 4. Cek Semua Antrian\n 5. Cek Antrian Paling Blekang\n 0. Exit");
    System.out.println("-----------------------------------");
    
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukkan kapasitas queue : ");
    int jumlah = sc.nextInt();
    Queue antri = new Queue(jumlah);
    
    int pilih;
    do{
        menu();
        pilih = sc.nextInt();
        sc.nextLine();
        
        switch(pilih){
            case 1:
                System.out.print("No Rekening\t: ");
                String norek = sc.nextLine();
                System.out.print("Nama\t\t: ");
                String nama = sc.nextLine();
                System.out.print("Alamat\t\t: ");
                String alamat = sc.nextLine();
                System.out.print("Umur\t\t: ");
                int umur = sc.nextInt();
                System.out.print("Saldo\t\t: ");
                int saldo = sc.nextInt();
                Nasabah nb = new Nasabah(norek, nama, alamat, umur, saldo);
                sc.nextLine();
                antri.enqueue(nb);
                break;
            case 2:
                Nasabah data = antri.dequeue();
                if(!"".equals(data.norek) && !"".equals(data.nama) &&!"".equals(data.alamat) && data.umur !=0 && data.saldo !=0){
                    System.out.println("Antrian yang keluar : " + data.norek+ " "+ data.nama+" "+ data.alamat+" "+data.umur+" "+data.saldo);
            }
                break;
            case 3:
                antri.peek();
                break;
            case 4:
                antri.print();
                break;
            case 5:
                antri.peekRear();
                break;
        }
    }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
}
}