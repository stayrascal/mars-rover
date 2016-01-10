
import java.util.Arrays;
import java.util.List;

public class MarsRover {

    private final List<String> orientationList = Arrays.asList("N", "E", "S", "W");
    private int x;
    private int y;
    private Orientation orientation;

    public MarsRover(int initialX, int initialY, String initialOrientation) {
        this.x = initialX;
        this.y = initialY;
        this.orientation = Orientation.valueOf(initialOrientation);
    }

    public void execute(String command) {
        if ("L".equalsIgnoreCase(command)) {
            orientation = orientation.turnLeft();
        } else if ("R".equalsIgnoreCase(command)) {
            orientation = orientation.turnRight();
        } else if ("M".equalsIgnoreCase(command)) {
            move();
        }
    }

    private void move() {
        if ("N".equalsIgnoreCase(orientation.name())) {
            y++;
        } else if ("E".equalsIgnoreCase(orientation.name())) {
            x++;
        } else if ("S".equalsIgnoreCase(orientation.name())) {
            y--;
        } else {
            x--;
        }
    }

    public String getPositionAndOrientation() {
        return x + " " + y + " " + orientation;
    }
}
