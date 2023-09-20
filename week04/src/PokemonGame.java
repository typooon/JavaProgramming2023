public class PokemonGame {
    public static void main(String[] args) {
        NoFly noFly = new NoFly();//노플라이 객체 생성
        Pikachu pikachu = new Pikachu(noFly); //노플라이 장착
        //pikachu.setFlyable(new NoFly());

        pikachu.performFly();
    }
}
