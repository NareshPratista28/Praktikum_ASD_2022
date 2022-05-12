package praktikum;
/**
 *
 * @author nares
 */
public class SLLMain {

    public static void main(String[] args){
        SingleLinkedList singLL = new SingleLinkedList();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 900);
        singLL.print();
        singLL.insertAfter(3, 833);
        singLL.print();
    }
    
}