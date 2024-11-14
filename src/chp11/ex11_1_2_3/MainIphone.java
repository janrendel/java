package chp11.ex11_1_2_3;

public class MainIphone {
    public static void main(String[] args) {
//        업캐스팅된 경우의 참조 변수는 부모의 것을 사용할 수 있고,
//        자식의 것은 오버라이딩된 것만 사용 가능
        Phone p = new IPhone();
        p.CallPhone("010-3544-7894");
        p.receivePhone("02-537-6875");
    System.out.println("제조사명: " + Phone.PRODUCT_NAME);

    IPhone iPhone = new IPhone();
    iPhone.beep();
    iPhone.CallPhone("02-537-6875");
    iPhone.playMusic("APT");
    iPhone.sendAirdrop("사진");
    iPhone.sendMessage("오늘 수능 대박나라~");

//    이미 생성된 객체의 참조 값을 이용해서 업캐스팅이 가능하다.
    Alarm alarm = iPhone;
    alarm.beep();
    alarm.playMusic("sticky");
    }
}