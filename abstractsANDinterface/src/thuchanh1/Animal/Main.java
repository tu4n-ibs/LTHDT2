package thuchanh1.Animal;

import thuchanh1.Animal.Chicken;
import thuchanh1.Animal.Tiger;
import thuchanh1.Animal.animal;
import thuchanh1.Fruit.Apple;
import thuchanh1.Fruit.Orange;
import thuchanh1.Fruit.fruit;
import thuchanh2.edible.Edible;

public class Main {
    public static void main(String[] args) {
        animal[] animals = new animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (animal animal1 : animals
        ) {
            System.out.println(animal1.makeSound());

            if (animal1 instanceof Chicken) {
                Edible edible = (Chicken) animal1;
                System.out.println(edible.howToEat());
            }
        }
        fruit[] fruits = new fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (fruit fruit1 : fruits
        ) {
            System.out.println(fruit1.howToEat());
        }
    }
}
