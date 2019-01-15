package animal;

import edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "roawwwwwww";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
