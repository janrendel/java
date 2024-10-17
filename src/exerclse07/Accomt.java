package exerclse07;

public class Accomt {
    private String num;
    private int Balance;

    public Accomt(String num, int Balance) {
        this.num = num;
        this.Balance = Balance;
    }
    public String getNum() {
        return num;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }

    public boolean transfer(Accomt accomt, int amount){
        if (Balance >= amount)
            System.out.println("잔액이 부족하여 이체 불가능!!");
        return false;
    }

    @Override
    public String toString() {
        return "Accomt{" +
                "num='" + num + '\'' +
                ", Balance=" + Balance +
                '}';
    }
}
