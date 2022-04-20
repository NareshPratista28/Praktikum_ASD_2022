package tugas;
/**
 *
 * @author nares
 */
import java.util.Scanner;
public class strukBelanjaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner ss = new Scanner(System.in);
        
        System.out.println("================================");
        System.out.println("       Data Struk Belanja       ");
        System.out.println("================================");
        System.out.println();
        System.out.println("Masukkan jumlah struk :");
        int banyak = sc.nextInt();
        System.out.println();
        belanja blj = new belanja(banyak);
        
        int totalHarga = 0;
        int jml, harga;
        for (int i = 0; i < banyak; i++) {
        System.out.print("Nomor Transaksi\t\t: ");
        int nt =sc.nextInt();
        System.out.print("Tanggal Pembelian\t: ");
        String tanggal =ss.nextLine();
        System.out.print("Nama Barang\t\t: ");
        String nb =ss.nextLine();
        System.out.print("Jumlah Barang\t\t: ");
        jml = sc.nextInt();
        System.out.print("Harga Barang\t\t: ");
        harga = sc.nextInt();
        totalHarga =jml * harga;
        strukBelanja sb =new strukBelanja(nt, tanggal, nb, jml,harga);
        blj.push(sb);
        System.out.print("Total Harga\t\t: "+ totalHarga);
        System.out.println("\n");
    }
        char pilih;
     do{
        System.out.println("============================");
        System.out.println("        Menu Pilihan        ");
        System.out.println("============================");
        System.out.println(" 1. struk teratas\n 2. ambil struk 5 untuk mendapatkan voucher\n 3. sisa struk\n 4. keluar\n"); 
        System.out.print("(masukkan angka 1-4)");
        int pilihan =sc.nextInt();
        
        switch (pilihan){
        case 1:
            blj.peek();
            blj.print();
            break;
        case 2:
            blj.pop();
            blj.pop();
            blj.pop();
            blj.pop();
            blj.pop();
            break;
        case 3:
            blj.print();
            break;
                case 4:
                    System.out.println("Terima Kasih");
                    break;
                default:
                    System.out.println("Menu yang anda masukkan salah");
                    break;
            }if(pilihan == 4) {
                pilih = 't';                
            }else{
                System.out.print("Kembali ke menu Utama (y/t) : ");
                pilih = sc.next().charAt(0);
            }
        }while(pilih == 'y');
    }
}