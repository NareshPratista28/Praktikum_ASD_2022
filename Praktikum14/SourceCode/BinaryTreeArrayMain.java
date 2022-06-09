/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2;

/**
 *
 * @author nares
 */
public class BinaryTreeArrayMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseinOrder(0);
        
        System.out.println("");
        System.out.println("No 5");
        bta.add(90);
        bta.add(72);
        System.out.println("method traverse Pre Order");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.println("method traverse Post Order");
        bta.traversePostOrder(0);
        System.out.println("");
    } 
}
