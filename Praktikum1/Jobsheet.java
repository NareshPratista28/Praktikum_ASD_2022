//PEMILIHAN

package jobsheet;
import java.util.Scanner;
public class Jobsheet {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("MENGHITUNG NILAI AKHIR");
       System.out.println("==============================");
       System.out.println("Masukkan Nilai Tugas: ");
       int nilaiTugas = sc.nextInt();
       System.out.println("Masukkan Nilai UTS: ");
       int nilaiUTS = sc.nextInt();
       System.out.println("Masukkan Nilai UAS: ");
       int nilaiUAS = sc.nextInt();
        
        float nilaiAkhir;
        String nilaiHuruf;
        nilaiAkhir = (float) ((0.2*nilaiTugas) + (0.35*nilaiUTS) + (0.45*nilaiUAS));
        System.out.println("===================================================");
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        if(nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("SELAMAT ANDA LULUS");
        } else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
            nilaiHuruf = "B+";
            System.out.println("Nilai Huruf: " + nilaiHuruf); 
            System.out.println("SELAMAT ANDA LULUS");
        } else if(nilaiAkhir > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
            System.out.println("Nilai Huruf: " + nilaiHuruf); 
            System.out.println("SELAMAT ANDA LULUS");
        } else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
            System.out.println("Nilai Huruf: " + nilaiHuruf); 
            System.out.println("SELAMAT ANDA LULUS");
        } else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("SELAMAT ANDA LULUS");
        } else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
            nilaiHuruf = "D";
            System.out.println("Nilai Huruf: " + nilaiHuruf);
            System.out.println("MAAF ANDA TIDAK LULUS");
        } else if(nilaiAkhir > 0 && nilaiAkhir <= 39){
            nilaiHuruf = "E";
            System.out.println("Nilai Huruf: " + nilaiHuruf);   
            System.out.println("MAAF ANDA TIDAK LULUS");
        }
    }
}  
 
//Naresh Pratista | 2141720057