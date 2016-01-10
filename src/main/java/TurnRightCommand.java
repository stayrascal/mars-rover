
public class TurnRightCommand implements Command {

    @Override
    public void execute(MarsRover marsRover) {
        marsRover.setOrientation(marsRover.getOrientation().turnRight());
    }
}
