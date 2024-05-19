package attacks;
import lab2.Utils;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
public class ShadowBallMove extends SpecialMove{ //наследование и объявление класса
    public ShadowBallMove() {

        super(Type.GHOST, 80, 100); //вызов конструктора род класса
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) { //переопр метода на противника,снижение защиты
        if (Math.random() < 0.2) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, 2);
        }
    }
    @Override
    protected String describe() { //описание атаки

        return "Использует Shadow Ball";
    }
}
