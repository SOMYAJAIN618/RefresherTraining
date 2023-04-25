package CommandImplementation;

import java.util.ArrayList;
import java.util.List;

// The Receiver class
class Light {
    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}

// The Command interface
interface Command {
    void execute();
}

// The ConcreteCommand classes
class TurnOnCommand implements Command {
    private Light light;

    public TurnOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

class TurnOffCommand implements Command {
    private Light light;

    public TurnOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}

// The Invoker class
class RemoteControl {
    private List<Command> commandHistory = new ArrayList<>();

    public void pressButton(Command command) {
        command.execute();
        commandHistory.add(command);
    }

    public void showHistory() {
        System.out.println("Command History:");
        for (Command command : commandHistory) {
            System.out.println(command.getClass().getSimpleName());
        }
    }
}

// The Client class
public class CommandPatternExample {
    public static void main(String[] args) {
        Light light = new Light();
        RemoteControl remoteControl = new RemoteControl();

        // Create ConcreteCommand objects
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);

        // Press the buttons on the remote control
        remoteControl.pressButton(turnOnCommand);
        remoteControl.pressButton(turnOffCommand);

        // Show the command history
        remoteControl.showHistory();
    }
}
