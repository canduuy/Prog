package rocket.lab3.subject;

import rocket.lab3.Color;
import rocket.lab3.interfaces.Walkable;
import rocket.lab3.Material;
import rocket.lab3.PhysicalObject;

import java.util.Objects;

public class Rock extends PhysicalObject implements Walkable {
	protected boolean sitting = false;
	protected boolean isStand = true;

	public Rock(int size, Material material, Color color) {
		super(size, material, color);
	}

	@Override
	public void go() {
		isStand = true;
		System.out.println("на скале");
	}

	@Override
	public void sit() {
		isStand = true;
		System.out.println(" на скале");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Rock rock = (Rock) o;
		return sitting == rock.sitting;
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), sitting);
	}

	@Override
	public String toString() {
		return "Rock{" +
				"sitting=" + sitting +
				", size=" + size +
				", material=" + material +
				", color=" + color +
				'}';
	}
}
