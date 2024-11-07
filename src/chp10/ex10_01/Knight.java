package chp10.ex10_01;

public class Knight extends Novice {
    int stamina;

    void slash(){
        System.out.printf("%s(HP: %d stamina: %d)의 칼로 베기////\n)",name, hp, stamina);
    }

}
