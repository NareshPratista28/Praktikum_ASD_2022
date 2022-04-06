package Latihan3_praktikum;

public class array1Dimensi {
    int[] data;
    int max = 0;
    int posisi;
    int jumlah = 0;
    
    array1Dimensi(int nilai[]){
        data = nilai;
    }
    
    void tampil(){
        for(int i = 0; i < data.length; i++){
            System.out.println(data[i] + "");
            System.out.println();
        }
    }
    
    void bubbleSort(){
        for(int i = 0; i < data.length - 1; i++){
            for (int n = 1; n < data.length - i; n++){
                if(data[n] > data[n - 1]){
                    int tmp = data[n];
                    data[n] = data[n-1];
                    data[n - 1] = tmp;
                }
            }
        }
    }
    
    int Searching(int cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if(cari == data[mid]){
                return (mid);
            } else if (data[mid] > cari){
                return Searching(cari, mid + 1, right);
            } else {
                return Searching(cari, left, mid - 1);
            }
        }
        return -1;
    }
    
    int nilaiTerbesar() {
        for (int i = 0; i < data.length; i++){
            if(data[i] > max) {
                max = data[i];
            }
        }
        System.out.println("Nilai terbesar: " + max);
        return max;
    }
    
    void tampilPosisi(int pos) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == max) {
                jumlah++;
            }
        }
        System.out.println("jumlahnya " + jumlah);
        System.out.println();
        posisi = max;
        for (int i = 0; i < data.length; i++){
            if (posisi == data[i]){
                pos = i;
                System.out.println("Data Ditemukan pada index " + pos);
            }
        }
    }
}
