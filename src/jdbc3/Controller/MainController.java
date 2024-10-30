package jdbc3.Controller;

import jdbc.JDBCConnector;
import jdbc3.Repository.Productrepository;
import jdbc3.entity.Product;
import jdbc3.view.ProductView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MainController {
    public static void main(String[] args) {
        ArrayList<Product> arrList = Productrepository.getList();
        ProductView.printView(arrList);
    }

//    public static void printView(ArrayList<Product> arrList) {
//        ProductView productView = new ProductView();
//        productView.printHeader();
//        productView.printProduct(arrList);
//        productView.printfooter();
//
//    }
//    public static ArrayList<Product> getList(){
//        ArrayList<Product> arrList = new ArrayList<Product>();
//        Connection con = JDBCConnector.getConnection(); //연결객체
//        String sql = "select * from 제품";
//        try {
//            PreparedStatement pstmt = con.prepareStatement(sql); //연결객체
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                Product product = new Product();
//                product.setProNum(rs.getString("제품번호"));
//                product.setProName(rs.getString("제품명"));
//                product.setProStock(rs.getInt("재고량"));
//                product.setProPrice(rs.getInt("단가"));
//                product.setProduceName(rs.getString("제조업체"));
//                arrList.add(product);
//            }
//            rs.close();
//            con.close();
//        } catch (SQLException e){
//            throw new RuntimeException(e);
//        }
//        return arrList;
//    }
}
