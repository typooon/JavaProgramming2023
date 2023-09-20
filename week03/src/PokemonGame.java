//import Charizard;
//import Pikachu;
//import Pokemon;
//import Squirtle; 같은 파일 안에 있으면 임포트 안해도 됨

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
//
//        s1.attack();
//        p1.attack();
//

//        c1.attack();
//        c1.evolve();
//        //c1.type(); //부모 클래스의 변수로는 자식 클래스의 전용 메서드를 볼 수 없다
//
//        Charizard c2 = (Charizard)c1;// downcast
//        c2.type();
         }
    }

