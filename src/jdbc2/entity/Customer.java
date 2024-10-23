package jdbc2.entity;

public class Customer {
    private String customerID;
    private String custmoerName;
    private int age;
    private String level;
    private String job;
    private int reward;


    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustmoerName() {
        return custmoerName;
    }

    public void setCustmoerName(String custmoerName) {
        this.custmoerName = custmoerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}
