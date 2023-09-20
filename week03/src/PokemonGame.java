public class PokemonGame {
    public static void main(String[] args) {
//        Pokemon p0 = new Pokemon();
//        p0.attack();
//        p0.evolve();
        Squirtle s1 = new Squirtle();
        Pikachu p1 = new Pikachu();
        Pokemon c1 = new Charizard(); // upcast
        s1.setFlyable(new NoFly());
        p1.setFlyable(new NoFly());
        c1.setFlyable(new wings());

        p1.performFly();
        c1.performFly();
        s1.performFly();

        JetPack jetPack = new JetPack();
        p1.setFlyable(jetPack);
        p1.performFly();

        AirBalloon airBalloon = new AirBalloon();
        s1.setFlyable(airBalloon);
        s1.performFly();
         }
    }

