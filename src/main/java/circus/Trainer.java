package circus;

import circus.animals.Animal;
import circus.animals.Bird;
import circus.animals.Duck;
import circus.animals.Parrot;

public class Trainer {
    public static void main(String[] args) {
        Duck duck = new Duck();
        getToSpeak(duck);

        Bird bird = (Bird) duck;  // upcasting
        getToSpeak(bird);

        Animal a = (Animal) bird; // upcasting
        getToSpeak(a);

        Duck duck2 = (Duck) a; // downcasting
        getToSpeak(duck2);

        train(new Duck());
         train(new Parrot());

//        circus.animals.Animal animal2 = new circus.animals.Animal();
//        circus.animals.Bird bird2 = new circus.animals.Bird();

    }

    private static void getToSpeak(Animal animal) {

        System.out.println(animal.speak());
    }

    private static void train(Bird bird) {
        if (bird instanceof Duck) {
            Duck d = (Duck) bird;
            d.swim();
        } else {
            System.out.println("Not a duck! Not a duck!!");
        }
    }
}
