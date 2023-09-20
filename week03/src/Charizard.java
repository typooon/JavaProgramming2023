public class Charizard extends Pokemon {
    public Charizard(){
        System.out.println("자식클래스 (리자몽)");
        this.level =36;
        this.setHp(78);
        this.name = "리자몽";
    }
    public Charizard(int level, int hp, String name){
        super();
        System.out.println("자식 클래스(리자몽)");
    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + " 이(가) 광역 화염공격을 시전합니다.");
    }
}
