//import version11.Pokemon;
//import version11.Squirtle;

//import version11.*; //한번에 다 때려 넣으면 에러도 못찾고  에바임
public class PokemonGame {
    public static void main(String[] args) {
//        Squirtle s1 = new Squirtle();
//        Pikachu p1 = new Pikachu();
//        p1.evolve();
//        //s1.evolve();


        Pokemon p1 = new Pikachu(); // upcast, 부모클래스 타입의 변수는 자식 클래스의 객체를 받을 수 있다
        Pikachu p2 = new Pikachu(); // 캐스팅 x (형변환 x)

        //Pikachu p3 = new Pokemon(); // downcast 불가, 자식클래스 타입의 변수는 부모 클래스의 객체를 변환할 수 없다
        System.out.println(p1);
        System.out.println(p2);

        p1.attack();
        p2.attack();

        //p1.type();  //Pokemon  변수(부모 클래스)로 Pikachu전용(자식클래스) 메서드를 사용할 수 없다.
        p2.type(); //됨
//        Charizard p4 = (Charizard)p1; //런타임 에러
        Pikachu p3 = (Pikachu)p1;
        System.out.println(p3);
        p3.type();

        int i = 1;

        char j = (char)i;
         }
    }

