
public class Position {

    private final int minX = 0;
    private final int maxX = 5;
    private final int minY = 0;
    private final int maxY = 5;

    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(Vector vector) {
        this.x += vector.getX();
        this.y += vector.getY();
        validateBoundary();
    }

    private void validateBoundary() {
        this.x = this.x < minX ? minX : this.x;
        this.x = this.x > maxX ? maxX : this.x;
        this.y = this.y < minX ? minY : this.y;
        this.y = this.y > maxX ? maxY : this.y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}


