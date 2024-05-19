package rocket.lab3.human;

import rocket.lab3.exception.BadSpeakException;
import rocket.lab3.interfaces.Speaking;
import rocket.lab3.interfaces.Talkable;

public class Griffon extends Human implements Talkable, Speaking {


    public Griffon() {
        super(20, 180, 90, "Griffon");
    }

    public boolean isTalk = false;

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

    public void talk(String phrase) {
        isTalk = true;
        System.out.println(name + " " + phrase);

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

    @Override
    public void speak() throws BadSpeakException { //Переопределенный метод speak(), который может выбрасывать исключение BadSpeakException.
        isTalk = true;

        BadSpeakException exception = new BadSpeakException();
        exception.setExample("Какое там горе! Одна комедия! Никто его не обидит, не волнуйся! Пошли!");

        try {
            if (exception.equals()) {
                throw new BadSpeakException("Грифон", " Плохо");
            }//если не совпадают, выбрасывается исключение
        } catch (BadSpeakException e) {
            System.out.println(e.getMessage());
        }//Блок try-catch, который проверяет соответствие выведенного текста ожидаемому и обрабатывает исключение BadSpeakException, если тексты не совпадают.
    }

}


