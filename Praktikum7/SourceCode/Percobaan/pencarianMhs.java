package percobaan;

/**
 *
 * @author nares
 */
public class pencarianMhs {
    Mahasiswa listMhs[] = new Mahasiswa[5];
    int idx;
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        } else{
            System.out.println("Data sudah penuh!");
        }
    }
    
    void tampil(){
        for(Mahasiswa m: listMhs){
            m.tampil();
            System.out.println("====================");
        }
    }
    
    int FindSeqSearch(int cari){
        int posisi = -1;
        for(int j=0; j < listMhs.length; j++){
            if(listMhs[j].nim == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    int findBinarySearch(int cari, int left, int  right){
        int mid;
        if(right >= left){
            mid = (left+right)/2;
            if(cari == listMhs[mid].nim){
                return mid;
            } else if(listMhs[mid].nim > cari){
                return findBinarySearch(cari, left, mid -1);
            } else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
    
    void tampilPosisi(int x, int pos){
        if(pos != -1){
            System.out.println("data\t: " +x+" ditemukan di indeks ke-"+pos);
        } else{
            System.out.println("Data\t: "+x+" tidak ditemukan");
        }
    }
    
    void tampilData(int x, int pos){
        if(pos != -1){
            System.out.println("NIM\t: " + x);
            System.out.println("Nama\t: " + listMhs[pos].nama);
            System.out.println("Umur\t: " + listMhs[pos].umur);
            System.out.println("IPK\t: " + listMhs[pos].ipk);
        } else{
            System.out.println("data\t: " + x + "tidak ditemukan");
        }
    }
}
