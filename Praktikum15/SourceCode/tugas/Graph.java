/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum;
import java.util.Scanner;
/**
 *
 * @author nares
 */
public class Graph {
    int vertex;
    LinkedList list[];
 
    public Graph(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0;  i< vertex; i++) {
            list[i] = new LinkedList();
        }
    }
 
    public void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        list[destination].addFirst(source);
    }
 
    public void degree(int source) throws Exception {
        System.out.println("degree vertex " + source + " : " + list[source].size());
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i< vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source)
                    ++totalIn;
            }
                //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dai vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }
 
    public void removeEdge(int source, int destination) throws Exception {   // NOMOR 3
        for (int i = 0; i< vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }
 
    public void removeAllEdges() {
        for (int i = 0; i< vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasildikosongkan");
    }
 
    public void printGraph() throws Exception {       // NOMOR 4
        String namKota = "";
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                if (i == 0) {
                    namKota = "Malang";
                } else if (i == 1) {
                    namKota = "Surabaya";
                } else if (i == 2) {
                    namKota = "Gresik";
                } else if (i == 3) {
                    namKota = "Pandaan";
                } else if (i == 4) {
                    namKota = "Bandung";
                } else {
                    namKota = "Jakarta";
                }
                System.out.print("Vertex " + namKota + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }
    
    public boolean graphType(int source, int destination) throws Exception{ // NOMOR 2
    list[source].addFirst(destination);
    return true;
    }
    
    public static void main (String[] args) throws Exception { // NOMOR 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan vertex graph : ");
        int v = sc.nextInt();
        Graph G = new Graph(v);
        System.out.print("Masukkan banyak edge : ");
        int e = sc.nextInt();
        for (int i = 0; i < e; i++) {
            System.out.print("Masukkan Source : ");
            int source = sc.nextInt();
            System.out.print("Masukkan Destination : ");
            int des = sc.nextInt();

            G.addEdge(source, des);

        }
        G.printGraph();
        //Graph.addEdge(0, 1);
        //Graph.addEdge(0, 4);
        //Graph.addEdge(1, 2);
        //Graph.addEdge(1, 3);
        //Graph.addEdge(1, 4);
        //Graph.addEdge(2, 3);
        //Graph.addEdge(3, 4);
        //Graph.addEdge(3, 0);
        //Graph.removeEdge(1, 2);
        //Graph.printGraph();
        //Graph.degree(2);
    }
}