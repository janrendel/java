package chp11.ex11_4;

public class Rocket implements Flyable{
    @Override
    public void Fly() {
        System.out.println("로켓이 대기권 밖으로 수직 상승합니다.");
    }
}
