package pokemons;
import attacks.ShadowBallMove;
import attacks.TriAttackMove;
import attacks.DefenseCurlMove;
import ru.ifmo.se.pokemon.Type;
public class Porygon2Pokemon extends PorygonPokemon { //наследование класса

    public Porygon2Pokemon( int level) {
        super("Porygon2", level); // вызов конструктора род класса
        setStats(85, 80, 90, 105, 95, 60);//вызов метода и устан статистик
        setType(Type.NORMAL);//устан типа
        addMove(new DefenseCurlMove()); //вызов метода, для добавл к покемону
 }

}
