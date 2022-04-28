package praktikum1;
import java.util.Scanner;
/**
 *
 * @author nares
 */
public class QueueMain {
    public static void menu(){
        System.out.println("\nMasukkan Operasi yang diinginkan ");
        System.out.println(" 1. Enqueue\n 2. Dequeue\n 3. Print\n 4. Peek\n 5. Clear\n 0. Exit");
        System.out.println("-----------------------------------");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();
        
        Queue Q = new Queue(n);
        
        int pilih;
        do{
            menu();
            pilih = sc.nextInt();
            switch (pilih){
                case 1:
                    System.out.print("Masukkan data baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.dequeue();
                    if (dataKeluar != 0){
                        System.out.println("Data yang dikeluarkan : "+ dataKeluar);
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
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
