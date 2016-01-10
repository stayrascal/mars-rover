
public class MoveCommand implements Command {


    @Override
    public void execute(MarsRover marsRover) {
        marsRover.getPosition().move(CommandFactory.getVectorByOrientation(marsRover.getOrientation()));
    }
}
