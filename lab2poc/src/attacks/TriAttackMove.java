package attacks;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
public class TriAttackMove extends SpecialMove{//наследование и объявление класса
    public TriAttackMove() {

        super(Type.NORMAL, 80, 100);//вызов конструктора род класса
    }
    @Override
    protected  void applyOppEffects(Pokemon def){ //переопрд метода
        if (Math.random() < 0.2){ //сущ ли шанс на дальнейшие эфф
            double chanceCounter = Math.random();
            if (chanceCounter < 0.33){
                Effect.burn(def);
            }else if (chanceCounter < 0.66){
                Effect.freeze(def);
            }else {
                Effect.paralyze(def);
            }
        }

    }
    @Override
    protected String describe(){
        return "Использует Tri Attack";
    } //описание атаки
}
