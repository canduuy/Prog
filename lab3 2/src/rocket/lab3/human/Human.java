package rocket.lab3.human;

import rocket.lab3.interfaces.Talkable;
import rocket.lab3.interfaces.Walkable;
import rocket.lab3.subject.Rock;


import java.util.Objects;

public class Human implements Talkable, Walkable {
    protected final String name;
    protected int age;
    protected int height;
    protected int weight;
    protected HumanSense sense;
    protected boolean isStand = true;
    public boolean isSitting = false;

    public Human(int age, int height, int weight, String name) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        sense = HumanSense.SAD;
    }

    public String getName() {
        return name;
    }

    public void feelPitifully() {
        setSense(HumanSense.PITIFULLY);
    }

    public void setSense(HumanSense sense) {
        this.sense = sense;
        System.out.println(name + " стало его " + sense.getState());
    }

    public void feelAggression() {
        setSense(HumanSense.AGRESS);
    }


    public void feelReluctantly() {
        getSense(HumanSense.RELUCTANTLY);
    }

    public HumanSense getSense(HumanSense sense) {
        return sense;
    }

    public void goForWalk(Human human) {
        System.out.println(name + sense.getState() + " идет с Griffon");
    }


    //public void sitOnRock(Human human) {
    //	human.sit();
    //	System.out.println(name + " сидит на скале " + sense.getState());
    //} пененесла в скалу

    public void feelCry() {
        crySense(HumanSense.CRY);
    }

    public void crySense(HumanSense sense) {
        this.sense = sense;
        System.out.println(name + " громко" + sense.getState());
    }


    //@Override
    //public void go() {
    //	isStand = true; // надо вывести что кто-то куда-то пошел
    //	System.out.println(name + " идет"); //изменила с name на надо идти

    //}

    //@Override
    //public void sit() {
    //	isStand = true; // надо вывести что кто-то куда-то пошел
    //	System.out.println(name + " ");

    //}
    @Override
    public void talk() {
        isStand = true; // надо вывести что кто-то куда-то пошел
        System.out.println(name + " ");

    }

    @Override
    public void sit() {
        isSitting = true;
        //isStand = false; // надо вывести что кто-то куда-то пошел
        System.out.println(" сидит на скале");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && height == human.height && weight == human.weight && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, weight, name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sense=" + sense +
                ", name='" + name + '\'' +
                '}';
    }

    public void sitOnSome() {
        System.out.println("Вдалеке видна скала");
    }
}
