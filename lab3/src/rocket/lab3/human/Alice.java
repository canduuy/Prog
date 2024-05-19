package rocket.lab3.human;

import rocket.lab3.interfaces.Talkable;
import rocket.lab3.interfaces.Walkable;

public class Alice extends Human implements Walkable {
	public Alice() {
		super(19, 171, 70, "Alice");
	}


	@Override
	public String toString() {
		return " Alice{" +
				"age=" + age +
				", height=" + height +
				", weight=" + weight +
				", sense=" + sense +
				", name='" + name + '\'' +
				'}';
	}



}
