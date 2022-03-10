
package praktikum1;

/**
 *
 * @author nares
 */
public class prisma {
        double alas, tinggi, sisiTegak;
        
        public double hitungLuasPermukaan(){
            return ((alas*3) * tinggi + 2 * 1/(float)2 * alas * tinggi);
        }
        public double hitungVolume(){
            return ((1/(float)2 * alas * tinggi) * tinggi);
        }
    }

