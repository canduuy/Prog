package rocket.lab3.human;

public class Delicates extends Human {
	public Delicates() {
		super(21, 187, 80, "Delikates");
	}

	@Override
	public String toString() {
		return "Delikates{" +
				"age=" + age +
				", height=" + height +
				", weight=" + weight +
				", sense=" + sense +
				", name='" + name + '\'' +
				'}';
	}
}
