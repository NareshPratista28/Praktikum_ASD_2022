package praktikum2;
/**
 *
 * @author nares
 */
import java.util.Scanner;
public class PostFixMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, Q;
        System.out.println("Masukkan ekspresi matematika (infix)\t: ");
        Q = sc.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix post = new Postfix(total);
        P = post.konversi(Q);
        System.out.println();
        System.out.println("Postfix: " + P);
        sc.close();
    }
}
