package attacks;
import lab2.Utils;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
public class DoubleTeamMove extends StatusMove{ //наследование и объявление класса
    public DoubleTeamMove() {
        super(Type.NORMAL, 0, 0);
    } //вызывает конструктор род класса
    @Override
    protected void applySelfEffects(Pokemon pokemon) { //Переопределение метода
        super.applySelfEffects(pokemon);
        Utils.changeStat(pokemon, Stat.EVASION, 1);//вспомог класс и метод для уклонения
    }

    @Override
    protected String describe() {
        return "Использует Double Team";
    }//описание атаки
}
