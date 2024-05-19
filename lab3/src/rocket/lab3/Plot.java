package rocket.lab3;

import rocket.lab3.human.Alice;
import rocket.lab3.human.Delicates;
import rocket.lab3.human.Griffon;
import rocket.lab3.human.Human;

public class Plot {
	private final Human alice = new Alice();
	private final Human griffon = new Griffon();
	private final Human delikates = new Delicates();

	public Plot() {
	}

	public void run() {
		alice.talk("че она там говорит написать");
		griffon.feelAggression();
		alice.talk("че она там говорит написать");
		alice.feelReluctantly();
		alice.goForWalk(alice);
		delikates.sitOnRock(delikates);
		delikates.feelCry();
		alice.feelPitifully();

	}
}

