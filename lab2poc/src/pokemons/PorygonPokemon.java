package pokemons;
import attacks.ShadowBallMove;
import attacks.TriAttackMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class PorygonPokemon extends Pokemon{ //наследование класса
    public PorygonPokemon(String name, int level) {
        super(name, level);//вызов констр род класса
        setStats(85, 80, 90, 105, 95, 60);//вызов метода и устан статистик
        setType(Type.NORMAL);//устан типа
        ShadowBallMove ShadowBallMove = new ShadowBallMove();//созд экземпл
        addMove(ShadowBallMove);//вызов метода, для добавл их к покемону
        TriAttackMove TriAttackMove = new TriAttackMove();
        addMove(TriAttackMove);
    }
public PorygonPokemon(int level){
        this("Porygon", level);
} //конструткор, принимает 1 аргумент
}
