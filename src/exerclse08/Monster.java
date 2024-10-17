package exerclse08;

public class Monster {
    private String name;
    private int hp;
    private static int maxhp = 30;

    public Monster(String name) {
        this.name = name;
        this.hp = maxhp;
    }

    public String getName() {
        return name;
    }

    public void attack(Monster enemy){
        enemy.hp -= 10;
        System.out.printf("%d의 공격 -> %s의 체력: %d/%d",getName(),enemy.name,hp,maxhp);
    }

    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random()<0.5)? a: b;
            Monster defender = (attacker == a)? b: a;
            attacker.attack(defender);

        }
    }
}
