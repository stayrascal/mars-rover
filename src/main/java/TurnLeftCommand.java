public class TurnLeftCommand implements Command {

    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setOrientation(marsRover.getOrientation().turnLeft());
    }
}
