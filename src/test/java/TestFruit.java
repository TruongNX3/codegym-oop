import fruit.fruit;
import fruit.Orange;
import  fruit.Apple;

public class TestFruit {
    public static void main(String[] args) {
        fruit[] fruits= new fruit[2];
        fruits[0]= new Orange();
        fruits[1]= new Apple();
        for (fruit f: fruits) {
            System.out.println(f.howToEat());
        }
    }
}
