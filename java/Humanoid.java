import java.util.concurrent.ThreadLocalRandom;

public class Humanoid {

    public int Pos;

    public Humanoid(int pos) {
        Pos = pos;
    }

    public Humanoid attack(Humanoid humanoid){
        int outcome = ThreadLocalRandom.current().nextInt(0, 2);
        if(outcome == 0){
            return humanoid;
        } else {
            return this;
        }
    }

    @Override
    public String toString() {
        return "+";
    }

}
