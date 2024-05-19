package rocket.lab3.human;

import rocket.lab3.interfaces.Walkable;

public class Delicates extends Human implements Walkable {
    public boolean isSitting = false;

    public Delicates() {
        super(21, 187, 80, "Delikates");
    }

    @Override
    public void sit() {
        isSitting = true;
        //isStand = false; // надо вывести что кто-то куда-то пошел
        System.out.println(name + sense.getState() + " сидит на скале");

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
