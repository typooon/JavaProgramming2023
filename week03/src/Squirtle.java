public class Squirtle extends Pokemon{
    public Squirtle(){
        this.level = 1;
        this.setHp(50);
        this.name = "꼬부기";
    }

    @Override
    void attack() {
        //super.attack();
        System.out.println(this.name + " 이(가) 물대포를 시전합니다.");
    }
}
