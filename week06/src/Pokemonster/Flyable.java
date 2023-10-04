package Pokemonster;

public interface Flyable {
//    public Pokemonster.Flyable();
    default void fly(){
        System.out.println("날아 갑니다!");;
    }
}
