package attacks;
import ru.ifmo.se.pokemon.*;

public class RestMove extends StatusMove { //наследование и объявление класса
    public RestMove() {

        super(Type.PSYCHIC, 0, 0); //вызов конструктора род класса
    }
    static Effect e = new Effect().condition(Status.SLEEP); //созд и устан статич эффект е, статик перем е-состояние
    //е будет одним и тем же для всех экземпляров рест мув

    @Override
    protected void applySelfEffects(Pokemon pokemon) {//переопределение метода на покем, восстановление хп
        pokemon.addEffect(e); //добавл созданный эффект сна
        pokemon.setMod(Stat.HP, -(int) (pokemon.getStat(Stat.HP)));
    }

    @Override
    protected String describe() {
        return "Решил отдохнуть";
    } //описание атаки
}
