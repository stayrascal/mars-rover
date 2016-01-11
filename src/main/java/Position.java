
public class Position {

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
        this.x = this.x < Constants.minX ? Constants.minX : this.x;
        this.x = this.x > Constants.maxX ? Constants.maxX : this.x;
        this.y = this.y < Constants.minY ? Constants.minX : this.y;
        this.y = this.y > Constants.maxY ? Constants.maxY : this.y;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}


