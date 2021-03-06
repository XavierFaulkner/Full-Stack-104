public class Organism implements Movable{

    int x;
    int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public String toString() {
        return "x: " + x + "; y: " + y;
    }
}
