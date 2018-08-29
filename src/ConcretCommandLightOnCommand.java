
import java.util.*;

/**
 * 
 */
public class ConcretCommandLightOnCommand implements Command {

	ReceiverLight light;

	public ConcretCommandLightOnCommand(ReceiverLight light) {
		this.light = light;
	}

	public void execute() {
		light.switchOn();
	}

}