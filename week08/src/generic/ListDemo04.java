package generic;
import Pokemonster.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ListDemo04 {
    public static void main(String[] args) {
        Flyable fly = new Wings();
        List<Pokemon> pokemons = new ArrayList<>(
                Arrays.asList(new Pikachu(fly), new Charizard(fly))
        );
        for (Pokemon pokemon : pokemons)
            pokemon.performFly();
    };
}
