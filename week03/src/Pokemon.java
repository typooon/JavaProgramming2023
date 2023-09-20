//public final class Pokemon {
public abstract class Pokemon {
    protected int level;
    private int hp;

    protected String name;

    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public abstract void attack();
    //public, private, protect 같은 설정이 없으면 디폴트값이 되는데 이떄 같은 패키지 안에 있지 않으면 불러올 수 없다
    public void evolve() {  //매개변수 제거
        if(this instanceof Pikachu){
            System.out.println("삐카삐카~");
        } else if (this instanceof Squirtle) {
            System.out.println("꼬북꼬북..");
        } else if (this instanceof Charizard) {
            System.out.println("흉포한 울음소리");
        }
        this.level = this.level + 1;    //매개변수 pokemon 대신에 this 사용
        this.hp = this.hp + 20;
        String texts = """
                    name의 레벨이
                    level으로 증가!
                """.replace("level", this.level+"").
                replace("name", this.name);
        System.out.println(texts);
    }
    private static int pokemonCount = 0; //클래스(정적) 변수
    Flyable flyable;

    public void setFlyable(Flyable flyable) { //upcast
        this.flyable = flyable;
    }

    public void performFly(){
        System.out.println(this.name + "이(가) ");
        this.flyable.fly();
    }

    public static int getPokemonCount() { //클래스(정적) 메서드
        return pokemonCount;
    }

    public Pokemon() {
        System.out.println("부모클래스");
        pokemonCount++;
    }
    public final void info(){   //final은 자식클래스에서 재정의(override)불가
        System.out.println("=============");
        System.out.println("이름 : " + name);
        System.out.println("레벨 : " + level);
        System.out.println("체력 : " + hp);
        System.out.println("=============");

    }
}