## LAPORAN PRAKTIKUM PERTEMUAN 3
>Nama  : Naresh Pratista<p>
>Kelas : 1F-D4TI<p>
>Absen : 22<p>

<br>

### 3.1 Tujuan Praktikum
1. Memahami dan menjelaskan fungsi array yang berisikan variabel objek.
2. Mahasiswa mampu menangkap logika tentang permasalahan array of object dalam Java
3. Mahasiswa mampu menerapkan pembuatan array of object dalam Java

<br>

### 3.2 Membuat Array dari Object, Mengisi dan Menampilkan
    Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat array dari object, kemudian mengisi dan menampilkan array tersebut.

### 3.2.1 Langkah-langkah Percobaan
> code class persegiPanjang
```java
package jobsheet3;
/**
 *
 * @author nares
 */
public class persegiPanjang {
    public int panjang;
    public int lebar;
    
}
```
> code main persegiPanjang

<img src = img/ppMain.png>

<br>

### 3.2.3 Pertanyaan
<br>

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method? Jelaskan!

    >- Ya, karena atribut di class berupa variabel yang akan dibaca di method untuk menghasilkan output

<br>    

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :

    >- Tidak dilakukan pemanggilan konstruktor, Deklarasi array of object

<br>  

3. Apa yang dimaksud dengan kode berikut ini:
    >- untuk menunjukan Instansiasi Array of Object dengan banyak array yang bisa diisi adalah 3.

<br> 

4. Apa yang dimaksud dengan kode berikut ini:
    >-  Deklarasi dan Instansiasi Objek dari Array of Object untuk mengisi-nya

<br>

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?

    >- Agar program bisa dijalankan dan tidak terjadi error 

<br>

### 3.3 Membuat Array dari Object, Mengisi dan Menampilkan
    Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi panjang yang ada di ppArray.

### 3.3.1 Langkah-langkah Percobaan

> code loop persegiPanjang
```java
package jobsheet3;

/**
 *
 * @author nares
 */
import java.util.Scanner;

public class persegiPanjangMain {

    public static void main(String[] args) {
        persegiPanjang[] ppArray = new persegiPanjang[3];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++)
        {   
            ppArray[i] = new persegiPanjang();
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Masukkan Panjang: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan Lebar: ");
            ppArray[i].lebar = sc.nextInt();
        }
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
```

<br>

### 3.3.2 Verifikasi Hasil Percobaan
<img src = img/ppLoopRun.png>

<br>

### 3.3.3 Pertanyaan

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?
    >- Ya, bisa

<br>

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!

    >- Misalkan perihal tentang nomor kursi ditempatkan oleh siapa, nah disitu nanti kita membuat String[][] kursi = new String[3][4], yang dimana 3 menunjukan baris dan 4 menunjukan kolom.

<br>

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode dibawah ini akan memunculkan error saat dijalankan. Mengapa?

    >- tidak ada Deklarasi dan Instansiasi Array Of Object sehingga menghasilkan error

<br>

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!
```java
import java.util.Scanner;
public class ArrayObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukkan element array : ");
        jumlah = sc.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[jumlah];
        
        
        for(int i = 0; i<ppArray.length; i++){
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" +i);
            System.out.print("Masukkan panjang : ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar : ");
            ppArray[i].lebar = sc.nextInt();
        }
        for(int i = 0; i<ppArray.length; i++){
            System.out.println("Persegi Panjang ke-" +i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
    }
}
```
<br>

5.  Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan pada ppArray[i] sekaligus ppArray[0]?Jelaskan !

    >- Tidak bisa, karena Deklarasi dan Instansiasi Array of Object, Array pertama sudah dideklarasikan di i, sehingga jika ada 0, maka akan terjadi error.
  
<br>

### 3.4 Operasi Matematika Atribut Object Array
    Pada praktikum ini kita akan melakukan pengoperasian matematika beberapa atribut pada masing-masing anggota array.

### 3.4.1 Langkah-langkah Percobaan

>- code class balokArray
```java
package balokArray;

/**
 *
 * @author nares
 */
public class balok {
    
    public int panjang;
    public int lebar;
    public int tinggi;
            
    public balok(int p, int l, int t)
    {
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    public int hitungVolume()
    {
        return panjang * lebar * tinggi;
    }
}
```
>- code main balokArray
<img src = balokMain.png>


### 3.4.2 Verifikasi Hasil Percobaan
<img src = img/balokRun.png>

### 3.4.3 Pertanyaan
Jika diketahui terdapat class Segitiga seperti berikut ini:
```java
public class segitiga {  
    
    public int alas;
    public int tinggi;
```
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.

<br>

>- code class segitigaArray
```java
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
```
>- code main segitigaArray
```java

package Segitiga;
/**
 *
 * @author nares
 */
public class segitigaMain {

    public static void main(String[] args) {
        segitiga[] sgArray = new segitiga[4];
        
        sgArray[0] = new segitiga(10, 4);
        sgArray[1] = new segitiga(20, 10);
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10);
        
    for(int i = 0; i < 4; i++)   
    {
        System.out.println("Luas Segitiga ke- " + i + ": " + sgArray[i].hitungLuas());
        System.out.println("Keliling Segitiga ke- " + i + ": " + sgArray[i].hitungKeliling());       
    }
  }   
}
```
### 3.5 Latihan Praktikum
1. Buatlah program yang dapat menghitung luas permukaan dan volume beberapa bangun ruang
(minimal 3, jenis bangun luas bebas). Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun
ruang. Dan buat satu main class untuk membuat array of objek yang menginputkan atribut-atribut
yang ada menggunakan konstruktor semua bangun ruang tersebut.
Keterangan : Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan
luas permukaan dan volume dari tiap jenis bangun ruang tersebut.

    >- Code Class Limas
    ```java
    public class limas {
    double alas, tinggi, sisiTegak;
    
    public double hitungLuasPermukaan(){
    return alas*tinggi/2 + 3*sisiTegak;
    }
    public double hitungVolume(){
    return (0.5*(0.5*alas*tinggi)*tinggi);

    }
    }
    ```
    >- Code Main Limas
    ```java
    import java.util.Scanner;
    public class limasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lms;
        
            System.out.print("Masukkan Jumlah Limas : ");
            lms = sc.nextInt();
            limas [] lim = new limas[lms];
    
            for(int i = 0; i<lim.length; i++){
                    lim[i] = new limas();
                    System.out.println("Limas ke- " +(i+1));
                    System.out.print("Alas : ");
                    lim[i].alas = sc.nextDouble();
                    System.out.print("Tinggi : ");
                    lim[i].tinggi = sc.nextDouble();
                    System.out.print("Sisi Tegak : ");
                    lim[i].sisiTegak = sc.nextDouble();
                    System.out.println();
    }
            for(int i = 0; i<lim.length; i++){
                System.out.println("Luas Permukaan Limas ke- " +(i+1) + ": " + lim[i].hitungLuasPermukaan());
                System.out.println("Volume Limas ke- " +(i+1) + ": " + lim[i].hitungVolume());
                System.out.println();
            }
        }
    }
    ```
    >- Hasil Output Limas
    <img src = img/limasRun.png> <p>

    >- Code Class Prisma 
    ```java
    public class prisma {
    double alas, tinggi, sisiTegak;
        
        public double hitungLuasPermukaan(){
            return ((alas*3) * tinggi + 2 * 1/(float)2 * alas * tinggi);
        }
        public double hitungVolume(){
            return ((1/(float)2 * alas * tinggi) * tinggi);
        }
    }
    ```
    >- Code Main Prisma 
    ```java
    public class prismaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prism;
        
            System.out.print("Jumlah Prisma : ");
            prism = sc.nextInt();
            prisma [] prsm = new prisma[prism];
    
            for(int i = 0; i<prsm.length; i++){
                    prsm[i] = new prisma();
                    System.out.println("Prisma ke- " +(i+1));
                    System.out.print("Alas : ");
                    prsm[i].alas = sc.nextDouble();
                    System.out.print("Tinggi : ");
                    prsm[i].tinggi = sc.nextDouble();
                    System.out.print("Sisi Tegak : ");
                    prsm[i].sisiTegak = sc.nextDouble();
                    System.out.println();
        }
            for(int i = 0; i<prsm.length; i++){
                System.out.println("Luas Permukaan Prisma ke- " +(i+1) + ": " + prsm[i].hitungLuasPermukaan());
                System.out.println("Volume Prisma ke- " +(i+1) + ": " + prsm[i].hitungVolume());
                System.out.println();
            }
        }
    }
    ```
    >- Hasil Output Prisma 
    <img src = img/prismaRun.png> <p>

    >- Code Class kubus 
    ```java
    public class kubus {
 
    public int sisi;
    public kubus(int s){
        sisi=s;
    }
    public int Volume(){
        return sisi*sisi*sisi;
    }
    public int luasPermukaan(){
        return 6*(sisi*sisi);
    }
    }   
    ```

    >- Code Main kubus 
    ```java
    import java.util.Scanner;
    public class kubusMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan banyak Kubus : ");
        int ku = sc.nextInt();
        
        kubus [] kb = new kubus[ku];
        for(int i=0;i<kb.length;i++){
            System.out.print("Masukkan Sisi ke- "+(i+1)+" : ");
            int si = sc.nextInt();
            kb[i]= new kubus(si);
        }
        for(int i=0;i<kb.length;i++){
            System.out.println("Kubus ke- "+(i+1));
            System.out.println("Sisi : "+kb[i].sisi);
            System.out.println("Luas Permukaan ke- "+(i+1)+" : "+kb[i].luasPermukaan());
            System.out.println("Volume ke- "+(i+1)+" : "+kb[i].Volume());
        }
    }
    }
    ```
    >- Hasil Output kubus
    <img src = img/kubusRun.png> 

<br>

2. Sebuah perusahaan jual beli tanah membutuhkan sebuah program yang dapat memberitahu luas tanah. Program tersebut dapat menerima input jumlah tanah yang akan dihitung dan atribut panjang dan lebar masing-masing dari tanah yang diinputkan. Program dapat menampilkan luas tanah masing-masing tanah yang diinputkan tadi dan juga tanah terluas dari ketiga tanah yang ada.

    >- Code Class nomor2
    ```java
    public class nomor2 {
    int lebar;
    int panjang;
    
    public int hitungLuas(){
    return panjang*lebar;
    }
    }
    ```
    >- Code Main nomor2
    ```java
    import java.util.Scanner;
    public class nomor2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tanah;
        System.out.println("Jumlah Tanah: ");
        tanah = sc.nextInt();
        nomor2[] n2 = new nomor2[tanah];
        System.out.println();
        
        for(int i = 0; i < n2.length; i++){
        n2[i] = new nomor2();
        System.out.println("Tanah " + (i+1));
        System.out.print("Panjang tanah: ");
        n2[i].panjang = sc.nextInt();
        System.out.print("Lebar Tanah: ");
        n2[i].lebar = sc.nextInt();
        System.out.println();
    }
        for(int i = 0; i < n2.length; i++){
        System.out.println("Luas tanah ke- " +(i+1) + ": " + n2[i].hitungLuas());
    }
    }
    }
    ```
    >- Hasil Output nomor2<p>
    <img src = img/no2Run.png>

3. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika
dimisalkan terdapat 3 data mahasiswa yang tersedia.

    >- Code Class nomor3
    ```java
    public class nomor3 {
    String nama, jKelamin;
    int nim;
    double ipk;
    }
    ```
    >- Code Main nomor3
    ```java
    import java.util.Scanner;
    public class nomor3Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sv = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
        nomor3 [] n3 = new nomor3[3];
    
    for(int i = 0; i<3 ; i++){
        n3[i] = new nomor3();
            System.out.println("Masukkan data mahasiswa ke- " +(i+1));
            System.out.print("Masukkan Nama : ");
            n3[i].nama = sc.nextLine();
            System.out.print("Masukkan Nim : ");
            n3[i].nim = sv.nextInt();
            System.out.print("Masukkan Jenis Kelamin : ");
            n3[i].jKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            n3[i].ipk = sx.nextDouble();
            System.out.println();
    }
    for(int i = 0; i<3; i++){
        System.out.println("Data mahasiswa ke-" +(i+1));
        System.out.println("Nama : " + n3[i].nama);
        System.out.println("Nim : " + n3[i].nim);
        System.out.println("Jenis Kelamin : " + n3[i].jKelamin);
        System.out.println("IPK : " + n3[i].ipk);
        System.out.println();
    }
    }
    }    
    ```
    >- Hasil Output nomor3<p>
    <img src = img/no3Run.png>








