public class Pikachu extends Pokemon {
    public Pikachu() {
        System.out.println("자식클래스 (피카츄)");
        this.level = 1;
        this.setHp(35);
        this.name = "피카츄";
    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + " 이(가) 백만볼트를 시전합니다.");
    }
//    부모클래스의 정적 메서드 getPokemonCount가 override된게 아니라
//    Picachu클래스의 정적메서드가 선언된 것
//    public static int getPokemonCount() {
//        return 7;
//    }

}
