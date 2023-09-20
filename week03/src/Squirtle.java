public class Squirtle extends Pokemon {
    public Squirtle(){
        super(); //부모클래스 기본 생성자 호출 (생략 가능)
        System.out.println("자식클래스 (꼬부기)");
        this.level = 1;
        this.setHp(50);
        this.name = "꼬부기";
    }

    @Override
    public void attack() {
        //super.attack();
        System.out.println(this.name + " 이(가) 물대포를 시전합니다.");
    }
}
