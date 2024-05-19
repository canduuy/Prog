package attacks;
import ru.ifmo.se.pokemon.*;

public class DrainingKissMove extends SpecialMove{//наследование и объявление класса
    public DrainingKissMove() {
        super(Type.FAIRY, 50, 100);
    }//вызов конструктора род класса
    @Override
    protected void applySelfDamage(Pokemon pokemon, double damage) {//переопределение метода для увел хп
        pokemon.setMod(Stat.HP, -(int)Math.round(damage));
    }
    @Override
    protected String describe() {
        return "Использует Draining Kiss";
    }//описание атаки
}
