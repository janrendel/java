package _gui.View;

import _gui.entity.OrderEntity;
import _gui.repository.OrderRepository;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;

public class OrderInfoView extends JPanel {

    JPanel panN = new JPanel(new GridLayout(2, 1));
    JPanel panC = new JPanel(new BorderLayout(5,20));

    JPanel pan1 = new JPanel();
    JPanel pan2 = new JPanel();


    JTextField tfSerch = new JTextField(20);
    DefaultTableModel tableModel;
    JTable table;
    String[] header = {"주문번호","주문고객","주문제품","수량","배송지","주문일자"};


    public OrderInfoView() {
        setLayout(new BorderLayout()); // borderLayout으로 설정

        panN.add(pan1);
        panN.add(pan2);

        add(panN,"North");
        add(panC,"Center");

        addPan1();
        addPan2();
        addTable();
        initList("");
    }

    public void addPan1(){
        JLabel lblTiltle = new JLabel("검색 프로그램");
        pan1.add(lblTiltle);
    }
    public void addPan2(){
        JLabel lblsearch = new JLabel("검색어:");
        JButton btnSearch = new JButton("검색");
        btnSearch.addMouseListener(new MouseAdapter() {});
        pan2.add(lblsearch);
        pan2.add(tfSerch);
        pan2.add(btnSearch);
    }

    public void addTable(){
        tableModel = new DefaultTableModel(header,15);

        table = new JTable(tableModel);
        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(70);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(50);
        columnModel.getColumn(4).setPreferredWidth(200);
        columnModel.getColumn(5).setPreferredWidth(100);

        JScrollPane scrollPane = new JScrollPane(table);
        panC.add(scrollPane);
    }

    public void initList(String searchWord){
        OrderRepository orderRepository = new OrderRepository();
        ArrayList<OrderEntity> orderList = orderRepository.getOrderList(searchWord);
        tableModel.setRowCount(orderList.size());

        int i = 0;
        for (OrderEntity orderEntity : orderList) {
            tableModel.setValueAt(orderEntity.getOrderNum(), i, 0);
            tableModel.setValueAt(orderEntity.getCustomerName(), i, 1);
            tableModel.setValueAt(orderEntity.getProductName(), i, 2);
            tableModel.setValueAt(orderEntity.getAmount(), i, 3);
            tableModel.setValueAt(orderEntity.getDestnation(), i, 4);
            tableModel.setValueAt(orderEntity.getOrderDate(), i, 5);

            i++;
        }
    }
}