
package jobsheet5.sum;

/**
 *
 * @author nares
 */
public class sum {
    public int elemen;
    public double keuntungan[];
    public double total;
    
    sum(int elemen){
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }
    double totalBF(double arr[]){
        for (int i=0; i<elemen; i++){
            total = total + arr[i];
        }
        return total;
    }
    double totalDC(double arr[], int l, int r){
        if(l == r){    
        return arr[l];
    } else if (l < r) {
        int mid = (1 + r) / 2;
        double lsum = totalDC(arr, l, mid - 1);
        double rsum = totalDC(arr, r, mid + l);
        return lsum + rsum + arr[mid];
    }
        return 0;
}
}
