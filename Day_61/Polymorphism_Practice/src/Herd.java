import java.util.ArrayList;

public class Herd implements Movable{

    ArrayList<Movable> heard = new ArrayList<>();
    @Override
    public void move(int dx, int dy) {
        for(Movable m : heard) {
            m.move(dx, dy);
        }
    }

    public void addToHerd(Movable movable) {
        heard.add(movable);
    }

    public String toString() {
        String listOfPositions = "";
        for(Movable m : heard) {
            listOfPositions += (m.toString() + "\n");
        }
        return listOfPositions;
    }
}
