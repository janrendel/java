package chp10.ex10_6;

import java.util.ArrayList;

public class MainContoller {
    public static void main(String[] args) {
        Square square = new Square();
        square.name = "정사각형";
        square.setWidth(7);

        Triangle triangle = new Triangle();
//        Triangle.name = "삼각형";
        triangle.setWidth(15);
        triangle.setHeight(90);

        Circle circle = new Circle();
//        Circle.name = "원";
        circle.setR(15);

//        ArrayList<Shape> arrList = new ArrayList<Shape>();
//        arrList.add(square);
//        arrList.add(triangle);
//        arrList.add(circle);
        Shape[] arr = {square, triangle, circle};

        viewShape(arr);
    }

    public static void viewShape(Shape[] arrList) {
        for (Shape shape : arrList) {
            System.out.printf("%s의 면적은 %.2f㎠입니다.\n",shape.name,shape.area());
        }

    }
}
