package attacks;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
public class DefenseCurlMove extends StatusMove{ //наследование и объявление класса
    public DefenseCurlMove() {
        super(Type.NORMAL, 0, 0);
    } // вызывает конструктор род класса
    @Override
    protected void applySelfEffects(Pokemon att){
        att.setMod(Stat.DEFENSE, 1);
    } //переопрделеление метода, увел защиту
    @Override
    protected String describe() {
        return "Использует Defence Curl";
    } //описание атаки
}

