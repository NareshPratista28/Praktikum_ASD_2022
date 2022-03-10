
package Segitiga;
/**
 *
 * @author nares
 */
public class segitiga {  
    
    public int alas;
    public int tinggi;
    
    public segitiga(int a, int t)
    {
        alas = a;
        tinggi = t;
    }    
    public int hitungLuas()
    {
        return alas * tinggi / 2;    
    }   
    public int hitungKeliling()
    {
        return alas + alas + alas;
    }
}
