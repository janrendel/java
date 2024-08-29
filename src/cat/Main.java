package cat;

public class Main {
    public static void main(String[] args) {
        cat cat = new cat();
        cat.setName("AIcat");
        cat.getBreeds("Persian");
        cat.getWeight(3);

        System.out.printf("고양이 이름: %s \n",cat.getName());
        System.out.printf("고양이 품종: %s \n",cat.getBreeds());
        System.out.printf("고양이 몸무게: %.2f \n",cat.getWeight());

        System.out.print(cat.getName()+"이 ");
        cat.claw();

        System.out.print(cat.getName()+"이 ");
        cat.meow();



    }
}








