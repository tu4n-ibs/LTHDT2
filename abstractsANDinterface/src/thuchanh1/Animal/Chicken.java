package thuchanh1.Animal;

import thuchanh1.Animal.animal;
import thuchanh2.edible.Edible;

public class Chicken extends animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cococococ!";
    }
    @Override
    public String howToEat(){
        return "grill";
    }

}
