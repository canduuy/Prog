package rocket.lab3.human;

import rocket.lab3.interfaces.Sittiable;


public class Delicates extends Human implements Sittiable {
    public boolean isSitting = false;

    public Delicates() {
        super(21, 187, 80, "Delikates");
    }





    @Override
    public String getName() {
        return null;
    }

    @Override
    public void feelPitifully() {

    }

    @Override
    public void feelAggression() {

    }

    @Override
    public void feelReluctantly() {

    }

    @Override
    public HumanSense getSense(HumanSense sense) {
        return null;
    }

    @Override
    public void sit() {
        isSitting = true;
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
