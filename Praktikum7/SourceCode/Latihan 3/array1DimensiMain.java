
package Latihan3_praktikum;

/**
 *
 * @author nares
 */
public class array1DimensiMain {

    public static void main(String[] args) {
        int bil[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        array1Dimensi arr = new array1Dimensi(bil);

        int jum = 10;
        int max = 0;
        System.out.println("===============================");
        System.out.println("----DATA SEBELUM DI SORTIR-----");
        System.out.println("===============================");
        arr.tampil();
        arr.bubbleSort();
        System.out.println("===============================");
        System.out.println("-------Setelah Di Sorting------");
        System.out.println("===============================");
        arr.tampil();
        arr.nilaiTerbesar();
        arr.Searching(max, 0, jum - 1);
        arr.tampilPosisi(max);
    }
}

