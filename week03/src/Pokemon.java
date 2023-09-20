public class Pokemon {

    String name;

    int level;
    int hp;

    // constructor, 생성자(특수형태의 메소드)
    //리턴타입이 없으며 클래스의 이름과 같다
    Pokemon(){
        System.out.println("포켓몬 객체 생성!");
    }

    void evolve(int level){
        level = level +1;
        System.out.println("포켓몬스터의 레벨이 증가 :" +level);
    }
}
