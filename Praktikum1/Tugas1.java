
package tugas1;
public class Tugas1 {

    public static void main(String[] args) {
       String customer[] = {"Ani", "Budi", "Bina", "Cita"};
       int berat[] = {4,15,6,11};
               
               Double harga = 0.0;
               for(int x = 0; x < berat.length; x++) {
                   if(berat[x]>10){
                   harga = (Double)(harga+berat[x]*4500) - berat[x]*4500*0.05;
                }
                   harga = harga + berat[x]*4500;
                } 
                System.out.println("Pendapatan Smile Laundry Adalah : " + harga);
    }
    
}
