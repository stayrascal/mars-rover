import java.util.Arrays;
import java.util.List;

public class Orientation {

    private final List<String> directions = Arrays.asList("N", "E", "S", "W");
    private int index;

    public Orientation(String direction) {
        this.index = directions.indexOf(direction);
    }

    public void turnLeft() {
        index = index - 1 < 0 ? index - 1 + directions.size() : index - 1;
    }

    public void turnRight() {
        index = index + 1 >= directions.size() ? index + 1 - directions.size() : index + 1;
    }

    @Override
    public String toString() {
        return directions.get(index);
    }
}
