package chp08.ex8_4;

public class Avenger {
    private String name;
    private int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Avenger(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void punch(Avenger enemy) {
        System.out.printf("<%s>의 펀치가 날아갔다. ", name);
        enemy.setHp(enemy.getHp()-10);
        System.out.printf("=> <%s>의 체력이 %d로 감소했다.\n",enemy.getName(),enemy.getHp());



    }


}
