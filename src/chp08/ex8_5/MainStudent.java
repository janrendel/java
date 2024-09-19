package chp08.ex8_5;

public class MainStudent {
    public static void main(String[] args) {
        student s1 = new student(20240101, "유현주");
        student s2 = new student(20240102, "박현경");
        student s3 = new student(20240103, "윤이나");

        System.out.printf("생성된 student 객체의 개수: %d개",student.count);
    }
}