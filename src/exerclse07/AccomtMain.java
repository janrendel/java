package exerclse07;

public class AccomtMain {
    public static void main(String[] args) {
        Accomt a = new Accomt("123-45",10000);
        Accomt b = new Accomt("567-89",10000);

        while (a.transfer(b,3000)){
            System.out.println("A계좌에서 B계좌로 송금이 되었습니다.");
        }

        System.out.println(a.toString());
        System.out.println(b.toString());
    }
}
