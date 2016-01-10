import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

    private static final Map<String, Vector> directions = new HashMap<>();

    private static final Map<Character, Command> commands = new HashMap<>();

    static {
        directions.put("N", new Vector(0, 1));
        directions.put("E", new Vector(1, 0));
        directions.put("S", new Vector(0, -1));
        directions.put("W", new Vector(-1, 0));

        commands.put('L', new TurnLeftCommand());
        commands.put('R', new TurnRightCommand());
        commands.put('M', new MoveCommand());
    }

    public static Command createCommand(char commandChar) {
        return commands.get(commandChar);
    }

    public static Vector getVectorByOrientation(Orientation orientation) {
        return directions.get(orientation.toString());
    }
}
