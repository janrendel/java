package _gui.entity;

import java.sql.Timestamp;

public class OrderEntity {

    private String orderNum;
    private String ordercustomer;
    private String customerName;
    private String productName;
    private String orderProduct;
    private int amount;
    private String destnation;
    private Timestamp orderDate;

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getOrdercustomer() {
        return ordercustomer;
    }

    public void setOrdercustomer(String ordercustomer) {
        this.ordercustomer = ordercustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getOrderProduct() {
        return orderProduct;
    }

    public void setOrderProduct(String orderProduct) {
        this.orderProduct = orderProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDestnation() {
        return destnation;
    }

    public void setDestnation(String destnation) {
        this.destnation = destnation;
    }

    public Timestamp getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Timestamp orderDate) {
        this.orderDate = orderDate;
    }
}