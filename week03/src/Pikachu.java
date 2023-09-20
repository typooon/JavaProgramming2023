public class Pikachu extends Pokemon{
    public Pikachu() {
        this.level = 1;
        this.setHp(35);
        this.name = "피카츄";
    }

    @Override
    void attack() {
        //super.attack();
        System.out.println(this.name + " 이(가) 백만볼트를 시전합니다.");
    }
}
