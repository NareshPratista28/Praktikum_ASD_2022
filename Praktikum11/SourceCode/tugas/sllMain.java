/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;

/**
 *
 * @author nares
 */
public class sllMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        singleLinkedList singLL = new singleLinkedList();
        
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
        System.out.println("dibawah ini hasil output penambahan method insertBefore()");
        singLL.insertBefore(760, 450);
        singLL.print();
        
        System.out.println("\nData pada index ke-1\t\t: "+singLL.getData(1));
        System.out.println("Data 3 berada pada indeks ke\t: "+singLL.indexOf(760)+"\n");
        
        singLL.remove(999);
        singLL.print();
        singLL.removeAt(0);
        singLL.print();
        singLL.removeFirst();
        singLL.print();
        singLL.removeLast();
        singLL.print();
    }
}