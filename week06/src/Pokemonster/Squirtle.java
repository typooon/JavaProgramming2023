package Pokemonster;

import java.util.ArrayList;

public class Squirtle extends Pokemon {
    public Squirtle(Flyable f) {
        super();
        System.out.println("꼬북꼬북");
        this.level = 1;
        this.setHp(44);
        this.attackRate = (int)(Math.random() * 4) + 45;
        this.defenceRate = 65;
        this.name = "꼬부기";
        this.flyable = f;

        this.skills = new ArrayList<>();
        this.specialAttackRate = new ArrayList<>();
        this.skills.add("몸통박치기");
        this.skills.add("아쿠아테일");
        this.skills.add("물의 파동");
        this.specialAttackRate.add(40);
        this.specialAttackRate.add(90);
        this.specialAttackRate.add(60);

//        this.skills = new String[]{"몸통박치기", "아쿠아 테일", "물의 파동"};
//        this.specialAttackRate =new int[]{40, 90, 60};
    }

    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 광역 물대포 공격을 시전합니다");
    }
}
