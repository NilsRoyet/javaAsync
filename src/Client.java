
import java.util.*;

/**
 * 
 */
public class Client {

	public static void main(String[] args) {

		InvokerRemoteControl control = new InvokerRemoteControl();

		ReceiverLight light = new ReceiverLight();

		Command lightsOn = new ConcretCommandLightOnCommand(light);

		Command lightsOff = new ConcretCommandLightOffCommand(light);

		// switch on

		control.setCommand(lightsOn);

		control.pressButton();

		// switch off

		control.setCommand(lightsOff);

		control.pressButton();

	}

}