public class MarsRover {

    private Position position;
    private Orientation orientation;

    public MarsRover(int initialX, int initialY, String initialOrientation) {
        this.position = new Position(initialX, initialY);
        this.orientation = Orientation.valueOf(initialOrientation);
    }

    public Position getPosition() {
        return position;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public void execute(String commands) {
        for (char command : commands.toCharArray()) {
            execute(command);
        }
    }

    public void execute(char direction) {
        Command command = CommandFactory.createCommand(direction);
        command.execute(this);
    }

    public String getPositionAndOrientation() {
        return position.toString() + " " + orientation.getOrientation();
    }
}
