/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;

/**
 *
 * @author nares
 */
public class Node {
    int data;
    Node left;
    Node right;
    
    public Node(){
    }
    public Node(int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
