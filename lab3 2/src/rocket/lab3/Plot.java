package rocket.lab3;

import rocket.lab3.human.Alice;
import rocket.lab3.human.Delicates;
import rocket.lab3.human.Griffon;
import rocket.lab3.human.Human;
import rocket.lab3.subject.Rock;

public class Plot {
    private final Human alice = new Alice();
    private final Human griffon = new Griffon();
    private final Human delikates = new Delicates();
    private final Rock rock = new Rock(2, Material.ROCK, Color.GREY);


    public Plot() {
    }

    public void run() {
        griffon.talk();
        alice.talk();
        alice.goForWalk(alice);
        rock.interact(alice);
        delikates.sit();
        delikates.feelCry();
        alice.feelPitifully();
        //griffon.feelAggression();
        //alice.go();
        //alice.feelReluctantly();
        //alice.goForWalk(alice);

    }
}

