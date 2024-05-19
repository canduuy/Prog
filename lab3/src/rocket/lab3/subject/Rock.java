package rocket.lab3.subject;

import rocket.lab3.Color;
import rocket.lab3.Material;
import rocket.lab3.PhysicalObject;
import rocket.lab3.exception.WrongRockSizeException;


public class Rock extends PhysicalObject {


    public Rock(int size, Material material, Color color) {
        super(size, material, color);
    } //Конструктор класса Rock, который вызывает конструктор суперкласса PhysicalObject с параметрами size, material и color.
    private int size = 2;
    boolean isSitting = true;

    public void less(int size){ //Метод less, который уменьшает размер скалы до заданного значения.
        if (size < 0){
            throw new WrongRockSizeException();//Проверка, если размер меньше 0, то выбрасывается исключение WrongRockSizeException.
        }
        while (this.size > size){
            this.size -=1;//Цикл, который уменьшает размер скалы до значения size.
        }
        System.out.println("Вдалеке видна скала");
    }


    @Override
    public String toString() {
        return "Rock{}";
    }
    public class Interact{ //нестатический вложенный класс
        Rock rock;
        public Interact(Rock rock) {
            this.rock = rock;
        } //Конструктор класса Interact, принимает объект типа Rock и инициализирует поле rock.
        public void interacted() {
            if(isSitting){
                rock.less(1);
            } //Метод interacted(), который вызывает метод less у объекта rock, если он сидит на скале(депрессирует)
        }

        @Override
        public String toString() {
            return "Interact{" +
                    "rock=" + rock +
                    '}';
        }
    }
}
