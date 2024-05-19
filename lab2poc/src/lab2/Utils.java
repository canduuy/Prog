package lab2;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Utils {
    public static boolean checkChance(double chance) {//метод статик,принимает параметр дс
        return chance >= Math.random(); //от 0 до 1
    }

    public static void changeStat(Pokemon pokemon, Stat stat, int difference) {//статик метод для статистики, объект
        //что изменить, и на что изм
        pokemon.setMod(stat, (int) (pokemon.getStat(stat) + difference)); //устан новое значение
    }
}