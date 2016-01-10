import java.util.Arrays;
import java.util.List;

public class MarsRover {

    private final List<String> orientationList = Arrays.asList("N", "E", "S", "W");
    private int x;
    private int y;
    private String orientation;

    public MarsRover(int initialX, int initialY, String initialOrientation) {
        this.x = initialX;
        this.y = initialY;
        this.orientation = initialOrientation;
    }

    public void execute(String command) {
        if ("L".equalsIgnoreCase(command)) {
            turnLeft();
        } else if ("R".equals(command)) {
            turnRight();
        }
    }

    private void turnRight() {
        int preOrientationIndex = orientationList.indexOf(orientation) < 3 ? orientationList.indexOf(orientation) : 0;
        orientation = orientationList.get(preOrientationIndex + 1);
    }

    private void turnLeft() {
        int preOrientationIndex = orientationList.indexOf(orientation) > 0 ? orientationList.indexOf(orientation) : orientationList.size();
        orientation = orientationList.get(preOrientationIndex - 1);
    }

    public String getPositionAndOrientation() {
        return x + " " + y + " " + orientation;
    }
}
