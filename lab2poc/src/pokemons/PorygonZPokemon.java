package pokemons;
import attacks.ShadowBallMove;
import attacks.TriAttackMove;
import attacks.DefenseCurlMove;
import attacks.AgilityMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class PorygonZPokemon extends Pokemon { //наследование класса
    public PorygonZPokemon(int level) {
        super("PorygonZ", level);//вызов конст род класса
        setStats(85, 80, 70, 135, 75, 90);//вызов метода и устан статистик
        setType(Type.NORMAL);//устан типа
        ShadowBallMove ShadowBallMove = new ShadowBallMove();//созд экземпл
        addMove(ShadowBallMove);//вызов метода, для добавл их к покемону
        TriAttackMove TriAttackMove = new TriAttackMove();
        addMove(TriAttackMove);
        DefenseCurlMove DefenseCurlMove = new DefenseCurlMove();
        addMove(DefenseCurlMove);
        AgilityMove AgilityMove = new AgilityMove();
        addMove(AgilityMove);
    }
}
