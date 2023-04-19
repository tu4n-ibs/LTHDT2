package thuchanh2;

import thuchanh2.edible.Edible;

public class Cat extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "meo meo meo";
    }

    @Override
    public String howToEat() {
        return "mouth";
    }
}
