package pokemons;
import attacks.ConfideMove;
import attacks.SeismicTossMove;
import attacks.BodySlamMove;
import attacks.DoubleTeamMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class ThrohPokemon extends Pokemon{//наследование класса
    public ThrohPokemon(int level) {
        super("Throh", level);//вызов конст род класса
        setStats(85, 80, 70, 135, 75, 90);//вызов метода и устан статистик
        setType(Type.NORMAL);//устан типа
        ConfideMove ConfideMove =new ConfideMove();//созд экземпл
        addMove(ConfideMove);//вызов метода, для добавл их к покемону
        SeismicTossMove SeismicTossMove = new SeismicTossMove();
        addMove(SeismicTossMove);
        BodySlamMove BodySlamMove = new BodySlamMove();
        addMove(BodySlamMove);
        DoubleTeamMove DoubleTeamMove = new DoubleTeamMove();
        addMove(DoubleTeamMove);
    }
}
