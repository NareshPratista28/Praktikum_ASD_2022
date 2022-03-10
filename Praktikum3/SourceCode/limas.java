
package praktikum1;
/**
 *
 * @author nares
 */
public class limas {
    double alas, tinggi, sisiTegak;
    
public double hitungLuasPermukaan(){
    return alas*tinggi/2 + 3*sisiTegak;
}
public double hitungVolume(){
    return (0.5*(0.5*alas*tinggi)*tinggi);

}
}