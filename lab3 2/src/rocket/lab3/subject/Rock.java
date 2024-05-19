package rocket.lab3.subject;

import rocket.lab3.Color;
import rocket.lab3.Material;
import rocket.lab3.PhysicalObject;
import rocket.lab3.human.Human;

public class Rock extends PhysicalObject {


    public Rock(int size, Material material, Color color) {
        super(size, material, color);
    }
    public void interact(Human alice) {
        alice.sitOnSome();
    }

 //  public void sitOnSome() {
   //  System.out.println("Они увидели скалу ");
   // }


    @Override
    public String toString() {
        return "Rock{}";
    }
}
