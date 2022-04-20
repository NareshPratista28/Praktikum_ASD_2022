package percobaan;
/**
 *
 * @author nares
 */
import java.util.Scanner;
public class StackMain {
    public static void main(String[] args) {
        Stack st = new Stack(8);
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
        
        char pilih;
        do{
            System.out.println("============================");
            System.out.println("        Menu Pilihan        ");
            System.out.println("============================");
            System.out.println("1. Push\n 2. Pop\n 3. Peek\n 4. Print\n 5. Harga Terendah\n");
            int pilihan;
            System.out.println("Masukkan angka 1-5");
            pilihan = sd.nextInt();
        
            switch (pilihan){
                case 1:
                    do{
                       System.out.print("Jenis\t: ");
                       String jenis = sc.nextLine();
                       System.out.print("Warna\t: ");
                       String warna = sc.nextLine();
                       System.out.print("Merk\t: ");
                       String merk = sc.nextLine();
                       System.out.print("Ukuran\t: ");
                       String ukuran = sc.nextLine();
                       System.out.print("Harga\t: ");
                       double harga = sc.nextDouble();
                       System.out.println("");

                       Pakaian bk = new Pakaian(jenis, warna, merk, ukuran, harga);
                       System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
                       pilih = sc.next().charAt(0);
                       sc.nextLine();
                       st.push(bk);

                }while (pilih == 'y');
                    break;
                    
                case 2:
                    st.pop();
                    break;
                    
                case 3:
                    st.peek();
                    break;
                    
                case 4:
                    st.print();
                    break;
                
                default:
                    System.out.println("Input yang anda masukkan salah");
                    System.exit(0);
            }if(pilihan == 5){
                pilih = 't';
            }else{
                System.out.println("Kembali ke menu utama (y/n) ");
                pilih = sc.next().charAt(0);
            }
        }while (pilih == 'y');
        
    }
    
}
