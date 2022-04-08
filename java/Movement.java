import java.util.Scanner;

public class Movement {

    public static Scanner scanner;

    public static void main(String[] args) {
        Land test = new Land();
        scanner = new Scanner(System.in);
        test.board();
        Combat(test);

    }

    public static String Combat(Land test){

        playerMovement(test.knight, askInput());
        if(test.knight.Pos == test.monster.Pos){
            test.knight.attack(test.monster);
            return null;
        }
        test.board();
        playerMovement(test.monster, "d");
        if(test.knight.Pos == test.monster.Pos){
            test.monster.attack(test.knight);
            return null;
        }
        test.board();
    return null;
    }

    public static String askInput(){
        System.out.println("Enter direction");
        String direction = scanner.next();

        if(!direction.equalsIgnoreCase("w") &&
           !direction.equalsIgnoreCase("a") &&
           !direction.equalsIgnoreCase("s") &&
           !direction.equalsIgnoreCase("d")){
            System.out.println("YOU STUPID");
            return askInput();
        }
        return direction;
    }

    public static void playerMovement(Humanoid creatures, String direction){
        int pos = switch (direction){
            case "w" -> creatures.Pos - Land.WIDTH;
            case "a" -> creatures.Pos -1;
            case "s" -> creatures.Pos + Land.WIDTH;
            case "d" -> creatures.Pos +1;
            default -> 0;
        };
        if(pos < 0){
            pos += Land.WIDTH * Land.HEIGHT;
        } else if (pos >= Land.WIDTH * Land.HEIGHT){
            pos -= Land.WIDTH * Land.HEIGHT;
        }
        creatures.Pos = pos;
    }
}
