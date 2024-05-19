package rocket.lab3.human;

import rocket.lab3.exception.BadSpeakException;
import rocket.lab3.interfaces.*;

//здесь соблюдается принцип барбары лисков
import java.util.Objects;
//экземпляры подклассов Human должны заменяться экземплярами типа Human.
public abstract class Human implements Talkable, Sittiable, Speaking {
    protected final String name; //поля определяются
    protected int age;
    protected int height;
    protected int weight;
    protected HumanSense sense;
    protected boolean isStand = true;
    public boolean isSitting = false;
    private boolean isSpeak;
   // HumanSense humanSense =  HumanSense.Clear;

    public Human(int age, int height, int weight, String name) { //конструктор принимает параметры и инициализирует поля
        //объекта Human
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;
        sense = HumanSense.SAD;
    }

    public abstract String getName();

    public abstract void feelPitifully();

    public void setSense(HumanSense sense) {//устан состояние человека
        this.sense = sense;
        System.out.println(name + " стало его " + sense.getState());
    }


    public abstract void feelAggression();
    public abstract void feelReluctantly();
    public abstract HumanSense getSense(HumanSense sense);

    public void goForWalk(Human human) {
        System.out.println(name + sense.getState() + " идет с Griffon");
    }


    public void feelCry() {
        crySense(HumanSense.CRY);
    }

    public void crySense(HumanSense sense) {
        this.sense = sense;
        System.out.println(name + " громко" + sense.getState());
    }//Метод crySense(), устанавливающий состояние чувств человека как плачущего.
    public void feelGrief(String phrase, HumanSense humanSense){
        griefSense(phrase, HumanSense.GRIEF);
    }
    public void griefSense(String phrase, HumanSense sense){
        this.sense = sense;
        System.out.println(name + phrase + sense.getState() + " ?");
    }
    public void Silencing(String phrase){
        System.out.println(name + phrase);
    }




    public void sitOnSome() {
        System.out.println("Вдалеке видна скала");
    }
    public void AlmostCrying(){ //здесь должен быть локальный класс
        class PersonAlmostCrying implements Sighable {
            @Override
            public void sigh() {
                if (isSitting) {
                    System.out.println(name +" хочет убежать далеко далеко");
                } else {
                    System.out.println(name + " вздыхает");
                }

            }


        }
        PersonAlmostCrying person = new PersonAlmostCrying();
        person.sigh();
    }

    @Override
    public void talk(String phrase) {
        isStand = true;
        System.out.println(name + " " + phrase);

    }

    @Override
    public void sit() {
        isSitting = true;
        System.out.println(" сидит на скале");

    }
    @Override
    public void speak() throws BadSpeakException {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && height == human.height && weight == human.weight && isStand == human.isStand && isSitting == human.isSitting && isSpeak == human.isSpeak && Objects.equals(name, human.name) && sense == human.sense;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, height, weight, sense, isStand, isSitting, isSpeak);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sense=" + sense +
                ", isStand=" + isStand +
                ", isSitting=" + isSitting +
                ", isSpeak=" + isSpeak +
                '}';
    }
}


