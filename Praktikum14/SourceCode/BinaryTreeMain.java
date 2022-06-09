/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

/**
 *
 * @author nares
 */
public class BinaryTreeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        bt.addNodeR(50); //nomor 1
        
        bt.traversePreorder(bt.root);
        System.out.println("");
        bt.traverseInorder(bt.root);
        System.out.println("");
        bt.traversePostorder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreorder(bt.root);
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("Data Terbesar Adalah : ");
        bt.maksimal();
        System.out.println("Data Terkecil Adalah : ");
        bt.minimal();
        System.out.println("-------------------------------");
        System.out.println("data yang ada di leaf : ");
        bt.printLeft(bt.root);
        System.out.println();
        System.out.println("Data Leaf Berjumlah : "+bt.jumlahLeft());
    }
}
