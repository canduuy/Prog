package attacks;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.*;
public class AgilityMove extends StatusMove { //объявление класса, который наследуется
    public AgilityMove() {
        super(Type.PSYCHIC, 0, 0);
    } //вызывает конструктор родительского класса и передает ему значения (тип хода)
    @Override //переопределение
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    } //переопределение метода checkAccurac, всегда возвращает true

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect().turns(2).stat(Stat.SPEED, 2);//создание нового эффекта, повыш стат скор
        pokemon.addEffect(effect); //эффект применяется к покемону
    }

    @Override
    protected String describe(){
        return "использует Agility (скорость +2)";
    } //описание хода
}
