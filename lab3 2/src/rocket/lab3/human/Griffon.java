package rocket.lab3.human;

import rocket.lab3.interfaces.Talkable;

public class Griffon extends Human implements Talkable {
    public Griffon() {
        super(20, 180, 90, "Griffon");
    }

    public boolean isTalk = false;
    public void talk() {
        isTalk = true;
     System.out.println(name + " командует: Пошли, Пошли ");

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
