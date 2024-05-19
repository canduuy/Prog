package rocket.lab3.human;
import rocket.lab3.subject.Rock;
import rocket.lab3.interfaces.Talkable;


public class Alice extends Human implements Talkable {
    public boolean isTalk = false;

    public Alice() {
        super(19, 171, 70, "Alice");
    }
    private Rock rock;
  //  public void sitOnSome() {
   //     System.out.println("Алиса села на камень");
    //}
    @Override
    public void talk() {
        isTalk = true;
        //isStand = false; // надо вывести что кто-то куда-то пошел
        System.out.println(name + " жалуется"); //принцип открытости закрытости

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
