import java.util.ArrayList;
import java.util.List;

public class Land {

    public static final int WIDTH = 5;
    public static final int HEIGHT = 6;
    Humans knight;
    Goblins monster;

    Land(){
        knight = new Humans(10);
        monster = new Goblins(6);
    }

    public void board() {

        for(int i = 0; i < HEIGHT; i++){
            System.out.print("|");
                for(int x = 0; x < WIDTH; x++){
                    int pos = i * WIDTH + x;
                    if(knight.Pos == pos){
                        System.out.print(knight);
                    } else if (monster.Pos == pos){
                        System.out.print(monster);
                    } else {
                        System.out.print("_");
                    }
                    System.out.print("|");
                }
            System.out.println();
        }
        System.out.println();



    }
}
