package attacks;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;


public class WaterPulseMove extends SpecialMove { //наследование и объявление класса
    public WaterPulseMove() {
        super(Type.WATER, 60, 100); //вызов конструктора род класса

}
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.2) Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "Использует Water Pulse";
    } //описание атаки

}