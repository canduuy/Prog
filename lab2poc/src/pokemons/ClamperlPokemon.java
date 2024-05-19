package pokemons;
import attacks.WaterPulseMove;
import attacks.BlizzardMove;
import attacks.RestMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
public class ClamperlPokemon extends Pokemon{ //наследование класса
    public ClamperlPokemon(String name, int level) {//передает переменные
        super(name, level); //вызов констр род класса
        setStats(35, 64, 85, 74, 55, 32);//вызов метода и устан статистик
        setType(Type.WATER); //устан тип
        WaterPulseMove WaterPulseMove = new WaterPulseMove(); //созд экземпл
        addMove(WaterPulseMove); //вызов метода, для добавл их к покемону
        BlizzardMove BlizzardMove = new BlizzardMove();
        addMove(BlizzardMove);
        RestMove RestMove = new RestMove();
        addMove(RestMove);
    }
    public ClamperlPokemon(int level){
        this("Clamperl", level);
    } //конструткор, принимает 1 аргумент

}
