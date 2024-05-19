package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
public class ConfideMove extends StatusMove{ // наследование и объявление класса
    public ConfideMove() {

        super(Type.NORMAL, 0, 0); //вызывается конструктор суперкласса
    }
    @Override
    protected void applyOppEffects(Pokemon def){ //переопределение метода для атаки противника
        def.setMod(Stat.SPECIAL_ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "Использует Confide";
    } //описание атаки
}

