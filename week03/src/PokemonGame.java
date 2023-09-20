import java.util.ArrayList;

public class PokemonGame {
    public static void main(String[] args) {
        Squirtle s1 =new Squirtle();
        Pikachu p1 = new Pikachu();
        Charizard c1 = new Charizard();

        System.out.println(s1.getHp());
        System.out.println(s1.getLevel());

        p1.attack();
        c1.attack();
        s1.attack();

        c1.evolve();
        System.out.println(c1.getHp());
        System.out.println(c1.getLevel());
    }
        /*
        System.out.println(Pokemon.getPokemonCount());
        Pokemon squirtle = new Pokemon("꼬부기", 1);
        System.out.println(Pokemon.getPokemonCount());
        Pokemon pikachu = new Pokemon("피카츄");
        System.out.println(Pokemon.getPokemonCount());
        Pokemon charizard = new Pokemon();
        System.out.println(Pokemon.getPokemonCount());

        System.out.println(pikachu.getName()
                + "의 체력은 " + pikachu.getHp()
                + "이고 레벨은 " + pikachu.getLevel()
                + "입니다");

        squirtle.evolve(squirtle);
        System.out.println(squirtle.getName());
        squirtle.evolve(squirtle);

//        pikachu.name = "피카츄";
//        charizard.name = "리자몽";

        charizard.setName("리자몽");

//        pikachu.setLevel(23);
//        pikachu.setHp(500);
        pikachu.setLevel(23).setHp(500);  // method chaining.


        charizard.setLevel(36);

        System.out.println(charizard.getName() + "의 체력은 " + charizard.getHp() + "이고 레벨은 " + charizard.getLevel() + "입니다");
        charizard.evolve(charizard);
        pikachu.evolve(pikachu);
        pikachu.evolve(pikachu);
        pikachu.setName("라이츄");
        System.out.println(pikachu.getName());
        pikachu.evolve(pikachu);

        System.out.println(pikachu.getName()
                + "의 체력은 " + pikachu.getHp()
                + "이고 레벨은 " + pikachu.getLevel()
                + "입니다");
        charizard.attack(squirtle);
        squirtle.attack();

         */
    }

