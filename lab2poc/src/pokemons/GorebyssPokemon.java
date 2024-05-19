package pokemons;
import attacks.WaterPulseMove;
import attacks.BlizzardMove;
import attacks.RestMove;
import attacks.DrainingKissMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class GorebyssPokemon extends ClamperlPokemon { //наследование класса
    public GorebyssPokemon(int level) {
        super("Gorebyss", level);//вызов конструткора род класса
        setStats(55, 84, 105, 114, 75, 52);//вызов метода и устан статистик
        setType(Type.WATER);//устан типа
       addMove(new DrainingKissMove());//вызов метода, для добавл к покемону

    }
}
