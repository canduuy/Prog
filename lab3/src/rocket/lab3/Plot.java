package rocket.lab3;

import rocket.lab3.exception.BadSpeakException;
import rocket.lab3.human.*;
import rocket.lab3.interfaces.Sighable;
import rocket.lab3.subject.Rock;
import rocket.lab3.interfaces.Speaking;

public class Plot {
    private final Human alice = new Alice(); //здесь вот они заменяются экземплярами типа Human
    private final Human griffon = new Griffon(); //Создание экземпляра класса Griffon и присвоение его переменной griffon, которая имеет тип Human.
    private final Human delikates = new Delicates();

    private final Rock rock = new Rock(2, Material.ROCK, Color.GREY);
    Rock.Interact interaction = rock.new Interact(rock);
    //при создании объекта Interact необходимо передать объект Rock в конструктор
    //через объект interaction вызывается метод interacted, который че то делает с рок
    //rock.new Interact - созд новый экземпляр класса Interact
    Speaking speakingGriffon = (Speaking) griffon;
    //Приведение объекта griffon к типу Speaking.
    Alice.GriffonQuestion griffonQuestion = new Alice.GriffonQuestion();
    //Создание объекта griffonQuestion класса GriffonQuestion, вложенного в класс Alice.
    private int timeInSecondsSinceSunrise;

    Sighable person = () -> System.out.println("Его глаза наполнены слезами"); //класс анонимусов
//созд объект персон типа Sighable, лямбда-выражение которое представляет собой реализацию метода sigh()
//при вызове метода sigh() у объекта person будет выведено сообщение

//без объекта rock нельзя было бы создать объект Interact и вызвать метод interacted
//рок исп для создания интеракт, тк интеракт явл влож классом в классе рок
//при созд интеракт нужно передать рок в конструктор, чтобы установить свзяь между ними
//Стрелка ->: разделяет список параметров и тело лямбда-выражения.



//Переменные alice, griffon и delikates инициализируются объектами типа Human - Alice, Griffon и Delikates
    public Plot() {
        timeInSecondsSinceSunrise = 43200;
    }
//Конструктор класса Plot, инициализирующий переменную timeInSecondsSinceSunrise.
    public void run()  {
        griffon.talk("командует: Пошли, Пошли");
        alice.talk(" жалуется");
        alice.goForWalk(alice);
        interaction.interacted();
        delikates.sit();
        delikates.feelCry();
        alice.feelPitifully();
        griffonQuestion.askQuestionToGriffon(alice, " спрашивает грифона:");
        delikates.feelGrief(" сильно", HumanSense.GRIEF);
        try {
            speakingGriffon.speak();
        } catch (BadSpeakException e) {
            throw new RuntimeException(e);
        }
        waitTimeInMinutes("Delikates", 1, " минуту");
        delikates.AlmostCrying();
        person.sigh();
        delikates.Silencing(" молчит");






    }
    public void waitTimeInMinutes(String name, int minutes, String phrase) {
        timeInSecondsSinceSunrise += (minutes * 60);
        System.out.println(name + " посмотрел на них через " + minutes + phrase);
    }







//создается объект interaction класса Interact, передавая в конструктор объект rock.
// вызывается метод interacted() через объект interaction

    }


