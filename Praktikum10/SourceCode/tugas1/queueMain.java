package tugas1;
/**
 *
 * @author nares
 */
import java.util.Scanner;
public class queueMain {
    public static void menu(){
        System.out.println("\nMasukkan Operasi yang diinginkan ");
        System.out.println(" 1. Enqueue\n 2. Dequeue\n 3. Print\n 4. Peek\n 5. Clear\n 6. Cari indeks \n 7. cari data\n 0. Exit");
        System.out.println("-----------------------------------");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas queue\t\t: ");
        int n = sc.nextInt();
        queue Q = new queue(n);
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru\t\t\t: ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan\t\t: "+ dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.print("Masukkan data yang akan dicari\t\t:");
                    int cari = sc.nextInt();
                    Q.peekPosition(cari);
                    break;
                case 7:
                    System.out.print("Masukkan indeks yang akan dicari\t:");
                    int posisi = sc.nextInt();
                    Q.peekAt(posisi);
                    break;     
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}