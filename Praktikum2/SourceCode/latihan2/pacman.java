package latihan2;

public class pacman {
    int x, y, width, height;

    pacman(){

    }
    pacman(int xm, int ym, int w, int  h){
        x = xm;
        y = ym;
        width = w;
        height = h;
    }
    void moveLeft(){
        if(x > 1) x--;
        printPosition();
    }
    void moveRight(){
        if(x < width) x++;
        printPosition();
    }
    void moveUp(){
        if(y > height) y++;
        printPosition();
    }
    void moveDown(){
        if(y > 1) y--;
        printPosition();    
    }
    void printPosition(){
        System.out.println("Position (" + x + ","+y+")");
 }
               
}
        

