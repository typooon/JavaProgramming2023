package Pokemonster;

import fly.Flyable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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

//        this.skills = new ArrayList<>();
//        this.specialAttackRate = new ArrayList<>();
//        this.skills.add("몸통박치기");
//        this.skills.add("아쿠아테일");
//        this.skills.add("물의 파동");
//        this.specialAttackRate.add(40);
//        this.specialAttackRate.add(90);
//        this.specialAttackRate.add(60);

//        this.skills = new ArrayList<>(Arrays.asList("몸통박치기", "아쿠아테일", "물의 파동"));
//        this.specialAttackRate = new ArrayList<>(Arrays.asList(40, 90, 60));
        this.skills = new HashMap<>(Map.of(1, "물대포", 2, "고속스핀", 3, "물의파동"));
        this.specialAttackRate = new HashMap<>(Map.of("물대포", 40, "고속스핀", 50, "물의파동", 60));

//        this.skills = new String[]{"몸통박치기", "아쿠아 테일", "물의 파동"};
//        this.specialAttackRate =new int[]{40, 90, 60};
    }

    @Override
    public void attack() {
        System.out.println(this.name + "이(가) 광역 물대포 공격을 시전합니다");
    }
}
