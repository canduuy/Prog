package attacks;
import ru.ifmo.se.pokemon.*;

public class BodySlamMove extends PhysicalMove{ //объявление класса, который наследуется, переопределяет поведение
    public BodySlamMove() {

        super(Type.NORMAL, 85, 100); //вызывает конструктор
    }
    @Override
    public void applyOppEffects(Pokemon pokemon) { //переопределение метода, с вероятностью 30%
        if (Math.random() <= 0.3) {
            Effect.paralyze(pokemon); //вызывает эффект
        }
    }

    @Override
    public String describe() {
        return("Парализован");
    } //описание атаки
}
