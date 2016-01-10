public class TurnLeftCommand implements Command {

    @Override
    public void execute(MarsRover marsRover) {
        marsRover.getOrientation().turnLeft();
    }
}
