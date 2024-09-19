package chp08.ex8_5;

public class student {
    static int count;

    int id;
    String name;

    student(int id, String name) {
        count++;
        this.id = id;
        this.name = name;

    }

}
