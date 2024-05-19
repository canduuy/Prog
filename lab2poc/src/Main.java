import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;


public class Main {

     public static void main(String[] args) {
         Battle b = new Battle();
         Pokemon p1 = new ClamperlPokemon(1);//созд объект clamper с помощ опер new выд память, затем вызыв
         //конструктор clamper с параметром, внутри него инициализируется параметр, после созд ссылка на объект
         //и сохр в переменной p1
         Pokemon p2 = new GorebyssPokemon(90);
         Pokemon p3 = new PorygonZPokemon(1);
         Pokemon p4 = new PorygonPokemon(200);
         Pokemon p5 = new Porygon2Pokemon(9);
         Pokemon p6 = new ThrohPokemon(15);


         b.addAlly(p5);
         b.addAlly(p2);
         b.addAlly(p1);

         b.addFoe(p4);
         b.addFoe(p3);
         b.addFoe(p6);
         b.go();
     }
}
