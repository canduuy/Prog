package rocket.lab3.human;
import rocket.lab3.subject.Rock;
import rocket.lab3.interfaces.Talkable;


public class Alice extends Human implements Talkable {
    public boolean isTalk = false;

    public Alice() {
        super(19, 171, 70, "Alice");
    }
    //Конструктор класса Alice, который вызывает конструктор суперкласса Human с параметрами:
    private Rock rock;
    public static class GriffonQuestion { //статический вложенный класс
        public void askQuestionToGriffon(Human alice, String phrase) {
            System.out.println(alice.name + phrase);
        }
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void feelPitifully() {
             setSense(HumanSense.PITIFULLY);
            //устан состояние человека
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
    public void talk(String phrase) {
        isTalk = true;
        System.out.println(name + phrase); //принцип открытости закрытости

    }

    @Override
    public String toString() {
        return "Alice{" +
                "isTalk=" + isTalk +
                ", rock=" + rock +
                '}';
    }
}
