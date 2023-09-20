import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        System.out.println("포켓몬 게임을 시작합니다.\n 야생의 포켓몬이 나타났습니다.");
//        System.out.println((int)(Math.random()*6)+1);
        int enemyPick = (int)(Math.random()*3);
        if (enemyPick == 0) {
            NoFly noFly = new NoFly();
            Pikachu pikachu = new Pikachu(noFly);
        } else if (enemyPick == 1) {
            NoFly noFly = new NoFly();
            Squirtle squirtle = new Squirtle(noFly);
        }else if (enemyPick == 2) {
            Wings wings = new Wings();
            Charizard charizard = new Charizard(wings);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 포켓몬을 고르세요.\n1) 피카츄 2) 꼬부기 3) 리자몽");
        int pick = scanner.nextInt();
        if (pick == 1) {
            Pikachu p1 = new Pikachu(new NoFly());
        }else if (pick == 2) {
            Squirtle s1 = new Squirtle(new NoFly());
        }else if (pick == 3) {
            Charizard c1 = new Charizard(new Wings());
        }else {
            System.out.println("다시입력해주세요");
        }
        int menu;
        while (true) {
            System.out.println("\t1) 싸운다 2) 도망간다 3) 게임을 종료한다");
            menu = scanner.nextInt();
            if (menu == 1){

            }else if (menu == 2){
                System.out.println("도망갑니다.");
            }else if(menu ==3){
                System.out.println("게임을 종료합니다.");
                break;
            }
        }
    }
}
