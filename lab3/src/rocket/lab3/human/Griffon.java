package rocket.lab3.human;

import rocket.lab3.interfaces.Talkable;

public class Griffon extends Human implements Talkable {
	public Griffon() {
		super(20, 180, 90, "Griffon");
	}





	@Override
	public String toString() {
		return "Griffon{" +
				"age=" + age +
				", height=" + height +
				", weight=" + weight +
				", sense=" + sense +
				", name='" + name + '\'' +
				'}';
	}
}
