package Pokemonster;

import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다.\n 야생의 포켓몬이 나타났습니다.");
//        System.out.println((int)(Math.random()*6)+1);
        Pokemon enemy = null;


        int enemyPick = (int)(Math.random()*3);
        if (enemyPick == 0) {
            NoFly noFly = new NoFly();
            enemy = new Pikachu(noFly);
        } else if (enemyPick == 1) {
            NoFly noFly = new NoFly();
            enemy = new Squirtle(noFly);
        }else if (enemyPick == 2) {
            Wings wings = new Wings();
            enemy = new Charizard(wings);
        }
//        Pokemonster.Pokemon player = new Pokemonster.Pokemon(); //추상클래스의 객체는 생성 불가
        Pokemon player; //추상클래스의 변수 선언은 가능( 업캐스트용)
        player = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 포켓몬을 고르세요.\n1) 피카츄 2) 꼬부기 3) 리자몽");
        int pick = scanner.nextInt();
        if (pick == 1) {
            player = new Pikachu(new NoFly());
        }else if (pick == 2) {
            player = new Squirtle(new NoFly());
        }else if (pick == 3) {
            player = new Charizard(new Wings());
        }else {
            System.out.println("다시입력해주세요");
        }
        int menu, skillMenu;
        while (true) {
            System.out.println("\t1)싸운다 2)도망간다 3)게임을 종료한다");
            menu = scanner.nextInt();
            if (menu == 1){
                System.out.print("전투기술 : 1)" + player.skills.get(0) + "/" + player.specialAttackRate.get(0) +
                        " 2)" + player.skills.get(1) + "/" + player.specialAttackRate.get(1) +
                        " 3)" + player.skills.get(2) + "/" + player.specialAttackRate.get(2));
                skillMenu = scanner.nextInt();
                //player.attack(enemy, scanner.3
                //next());
                player.attack(enemy, skillMenu);
            }else if (menu == 2){
                System.out.println("도망갑니다.");
            }else if(menu ==3){
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }

}
