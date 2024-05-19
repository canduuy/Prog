package attacks;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
public class BlizzardMove extends SpecialMove{ // наследование и объявление класса
    public BlizzardMove() {
        super(Type.ICE, 110, 70);
    } // вызывает конструктор класса Special и передает аргументы
    private boolean flag;//поле класса, для отслеживания заморожения

    @Override
    protected void applyOppEffects(Pokemon pokemon) {//переопределение метода
        int prob = (int)(Math.random() * 101);
        if (prob <= 10) {
            flag = true;
            Effect.freeze(pokemon); //если да, то вызывается эффект
        }
    }


    @Override
    protected String describe() { //описание атаки
        if (flag) return "Blizzard замораживает и наносит урон";
        else return "Атака Blizzard наносит урон";
    }
}
