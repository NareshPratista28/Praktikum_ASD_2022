/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author nares
 */
public class Node {
    int id;
    String judulFilm;
    double rating;
    Node prev, next;

    Node(Node prev, int id, String judulFilm, double rating, Node next) {
        this.prev = prev;
        this.id = id;
        this.judulFilm = judulFilm;
        this.next = next;
    }
}
