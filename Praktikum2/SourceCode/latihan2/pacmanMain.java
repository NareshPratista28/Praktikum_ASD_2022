package latihan2;
import java.util.Scanner;
public class pacmanMain {
    
    public static void main(String[] args) {
        pacman pcm = new pacman(10, 10, 20, 20);
        Scanner sc = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("-------How To Play-------");
        System.out.println("a = Move Left");
        System.out.println("d = Move Right");
        System.out.println("w = Move Up");
        System.out.println("s = Move Down");
        System.out.println("p = Exit");
        System.out.println("=========================");

        pcm.printPosition();
        loop :while (true) {
            switch(sc.nextLine()){
                case "a" :
                pcm.moveLeft();
                break;

                case "d" :
                pcm.moveRight();
                break;

                case "w" :
                pcm.moveUp();
                break;

                case "s" :
                pcm.moveDown();
                break;

                case "p" :
                System.out.println("TERIMA KASIH");
                break loop;

                default :
                pcm.printPosition();
                break;
            }
        }
        sc.close() ;
    }
}
